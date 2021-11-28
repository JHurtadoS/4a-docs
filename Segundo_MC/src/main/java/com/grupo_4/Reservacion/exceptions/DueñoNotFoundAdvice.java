package com.grupo_4.Reservacion.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody

public class DueñoNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(DueñoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(DueñoNotFoundException ex) {
        return ex.getMessage();
    }
}
