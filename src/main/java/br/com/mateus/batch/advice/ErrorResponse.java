package br.com.mateus.batch.advice;

public interface ErrorResponse<T extends ErrorResponseDetail> extends Response {
    T getError();
}
