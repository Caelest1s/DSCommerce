package com.devsuperior.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerce.entities.Product;

/**
 *  responsavel pelo repositório referenciando nome da classe e o tipo da PK
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
