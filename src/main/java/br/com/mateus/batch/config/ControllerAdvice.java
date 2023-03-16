package br.com.mateus.batch.config;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.mateus.batch.advice.ErrorResponse;
import br.com.mateus.batch.advice.ErrorResponseDetail;
import br.com.mateus.batch.advice.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvice {

    private static final String GENERIC_ERROR = "messages.generic.error";
    private static final String HANDLING_MESSAGE_TO_ERROR = "Handling message to error: {}";

    @ExceptionHandler(Throwable.class)
    private ResponseEntity<Response> error(Throwable exception) {
        log.error(HANDLING_MESSAGE_TO_ERROR, exception.getMessage(), exception);
        return ResponseEntity.status(INTERNAL_SERVER_ERROR)
                .body((ErrorResponse<ErrorResponseDetail>) () -> ErrorResponseDetail.builder()
                        .description(GENERIC_ERROR)
                        .error(GENERIC_ERROR)
                        .status(INTERNAL_SERVER_ERROR.value())
                        .build());
    }

}
