package com.devsuperior.dscommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;
import com.devsuperior.dscommerce.services.exceptions.DatabaseException;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

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

        // Optional<Product> result = repository.findById(id);
        Product result = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        // Product product = result.get();

        ProductDTO dto = new ProductDTO(result);
        /**
         * ProductDTO dto = new ProductDTO(product);
         * dto.setId(product.getId());
         * dto.setName(product.getName());
         * dto.setDescription(product.getDescription());
         * dto.setPrice(product.getPrice());
         * dto.setImgUrl(product.getImgUrl());
         * 
         * Resumo do método acima:
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

        // preenchemos o entity com os dados
        Product entity = new Product();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);

        return new ProductDTO(entity);
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO dto) {

        // 'getReferencedById' não vai no banco só prepara o OBJ, monitorado pelo JPA
        try {
            Product entity = repository.getReferenceById(id);
            copyDtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new ProductDTO(entity);
        } 
        catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Recurso não encontrado");
        }
    }

    // propagation é para quando o JAVA depende do JDBC que o impossibilita
    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {

        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Recurso não encontrado");
        }

        try {
            repository.deleteById(id);
        } 
        catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Falha de integridade referencial");
        }

    }

    // replicou 2x já é o suficiente para criar um método
    private void copyDtoToEntity(ProductDTO dto, Product entity) {

        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setImgUrl(dto.getImgUrl());
    }
}
