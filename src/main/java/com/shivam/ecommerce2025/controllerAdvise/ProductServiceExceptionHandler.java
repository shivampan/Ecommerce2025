package com.shivam.ecommerce2025.controllerAdvise;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Void> runTimeException(){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
