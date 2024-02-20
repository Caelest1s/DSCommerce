package com.devsuperior.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {

    private List<FieldMessage> errors = new ArrayList<>();

    // constructor
    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public void addError(String fieldName, String message) {
        // remove as msg errors repetidamente anteriores -> ex.: tentar salvar varias vzs com campo inválido
        errors.removeIf(x -> x.getFieldName().equals(fieldName));
        errors.add(new FieldMessage(fieldName, message));
    }

    // getter and setter
    public List<FieldMessage> getErrors() {
        return errors;
    }

}
