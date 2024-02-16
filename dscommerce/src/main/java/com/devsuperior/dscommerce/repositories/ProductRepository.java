package com.devsuperior.dscommerce.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dscommerce.entities.Product;

/**
 *  responsável pelo repositório referenciando nome da CLASSE e o tipo da Primary Key
 *  esse componente é responsável pela interação com a entidade no BD. 
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    @Query(""" 
        SELECT obj 
        FROM Product obj 
        WHERE UPPER (obj.name) LIKE UPPER (CONCAT ('%', :name, '%')) """)
    Page<Product> searchByName(String name, Pageable pageable);

    
}
