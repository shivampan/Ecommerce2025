package com.shivam.ecommerce2025.controllerAdvise;


import com.shivam.ecommerce2025.dtos.ExceptionDto;
import com.shivam.ecommerce2025.dtos.ProductNotFoundExceptionDto;
import com.shivam.ecommerce2025.exceptions.ProductNotFoundException;
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
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductNotFoundExceptionDto> handleProductNotFoundException(){
        ProductNotFoundExceptionDto exceptionDto = new ProductNotFoundExceptionDto();
        exceptionDto.setMessage("Product Not Found");
        exceptionDto.setResolution("PLease try again with a valid Product ID");

        return new ResponseEntity<>(exceptionDto, HttpStatus.NOT_FOUND);
    }
}
