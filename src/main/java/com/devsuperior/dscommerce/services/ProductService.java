package com.devsuperior.dscommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;

//Poderia utilizar o @Component também porém o Service tem uma melhor semântica
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    /**
     * @param id
     * @return ProductDTO
     * 
     *         Service busca no repositório(BD) o Entity e retorna para o controller
     *         um object DTO.
     *         Ele busca no banco e comunica com o DTO
     */

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = repository.findById(id);
        Product product = result.get();

        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setImgUrl(product.getImgUrl());

        /*
         * Resumo do método acima:
         * 
         * ProductDTO dto = new ProductDTO(product);
         * foi feito uma sobrecarga do construtor (product)
         * 
         * Product product = repository.findById(id).get();
         * return new ProductDTO(product);
         */
        return dto;
    }

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> results = repository.findAll(pageable);
        return results.map(x -> new ProductDTO(x));
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product entity = new Product();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setImgUrl(dto.getImgUrl());

        entity = repository.save(entity);

        return new ProductDTO(entity);
    }
}
