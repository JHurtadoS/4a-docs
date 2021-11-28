package com.grupo_4.Reservacion.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class MoneyExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(MoneyInsuficientException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String InsufficientBalanceAdvice(MoneyInsuficientException ex){
        return ex.getMessage();
    }
}
