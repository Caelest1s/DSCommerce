package com.devsuperior.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO extends CustomErrorDTO {

    private List<FieldMessageDTO> errors = new ArrayList<>();

    // constructor
    public ValidationErrorDTO(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public void addError(String fieldName, String message) {
        // remove as msg errors repetidamente anteriores -> ex.: tentar salvar varias vzs com campo inválido
        errors.removeIf(x -> x.getFieldName().equals(fieldName));
        errors.add(new FieldMessageDTO(fieldName, message));
    }

    // getter and setter
    public List<FieldMessageDTO> getErrors() {
        return errors;
    }

}
