package com.devsuperior.dscommerce.services.exceptions;

/**
 * RuntimeException não exige o bloco try...catch
 * diferente do Exception que exige o bloco try...catch
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String msg) {

        super(msg);
    }
}
