package br.com.mateus.batch.advice;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorResponseDetail {

    private final int status;
    private final String error;
    private final String description;
    private final List<FieldError> fields;

}
