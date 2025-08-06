package com.shivam.ecommerce2025.controllerAdvise;


import com.shivam.ecommerce2025.dtos.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionDto> runTimeException(){

        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("Something went wrong");
        exceptionDto.setResolutionDetails("You need to pay more money to get this fixed from us.Thanks!!");

        return new ResponseEntity<>(
                exceptionDto,
                HttpStatus.NOT_FOUND);
    }
}
