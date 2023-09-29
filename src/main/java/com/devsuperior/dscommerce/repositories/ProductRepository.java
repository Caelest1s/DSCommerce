package com.devsuperior.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerce.entities.Product;

/**
 *  responsável pelo repositório referenciando nome da CLASSE e o tipo da Primary Key
 *  esse componente é responsável pela interação com a entidade no BD. 
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
