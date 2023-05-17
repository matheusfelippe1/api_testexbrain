package com.testexbrain.api.validacao;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErroDeValidacaoHeandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public void heandle(){

    }

}
