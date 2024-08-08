package com.devsuperior.dscommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscommerce.entities.User;
import com.devsuperior.dscommerce.services.exceptions.ForbiddenException;

@Service
// contêm regras de negócios relacionadas a controle de acesso
public class AuthService {

    @Autowired
    private UserService userService;

    public void validateSeldOrAdmin(long userId) {
        User me = userService.authenticated();
        // 1º verifica se é admin. 2º verifica se client
        if (!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)) {
            throw new ForbiddenException("Access denied");
        }
    }
}
