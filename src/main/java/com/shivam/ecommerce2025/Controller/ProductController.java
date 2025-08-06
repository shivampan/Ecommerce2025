package com.shivam.ecommerce2025.Controller;

import com.shivam.ecommerce2025.Models.Product;
import com.shivam.ecommerce2025.Services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("id") Long ProductId){
        ResponseEntity<Product> responseEntity=null;
        Product product=null;

        try{
             product=productService.getSingleProduct(ProductId);
             responseEntity=new ResponseEntity<>(product, HttpStatus.OK);

        }
        catch(RuntimeException e){
            e.getStackTrace();
            responseEntity=new ResponseEntity<>(product,HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }
    @GetMapping("/")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }
    @PostMapping()
    public Product createProduct(@RequestBody Product product){

        return new  Product();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long ProductId){
        return null;
    }
}
