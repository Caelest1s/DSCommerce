package com.devsuperior.dscommerce.services.exceptions;

/**
 * RuntimeException não exige o bloco try...catch
 * diferente do Exception que exige o bloco try...catch
 */
public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg) {

        super(msg);
    }
}
