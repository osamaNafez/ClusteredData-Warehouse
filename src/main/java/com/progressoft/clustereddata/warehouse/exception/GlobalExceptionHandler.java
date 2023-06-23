package com.progressoft.clustereddata.warehouse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ResponseBody
    @ExceptionHandler(BindException.class)
    public ResponseEntity<List<BindExceptionResponse>> bindExceptionError(BindException bindException){
        List<BindExceptionResponse> exceptions = bindException.getFieldErrors()
                .stream()
                .map(error -> new BindExceptionResponse(error.getField(),error.getDefaultMessage()))
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(exceptions);
    }

    @ResponseBody
    @ExceptionHandler(DealDetailNotFoundException.class)
    public ResponseEntity<ExceptionResponse> dealDetailNotFoundExceptionHandler(DealDetailNotFoundException exception){
        return  ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ExceptionResponse(exception.getMessage()));
    }
}
