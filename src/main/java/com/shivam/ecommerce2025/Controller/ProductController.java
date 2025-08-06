package com.shivam.ecommerce2025.Controller;

import com.shivam.ecommerce2025.Models.Product;
import com.shivam.ecommerce2025.Services.ProductService;
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
    public Product getSingleProduct(@PathVariable("id") Long ProductId){
        return productService.getSingleProduct(ProductId);

    }
    @GetMapping("/")
    public List<Product> getAllProducts(){

        return new ArrayList<>();
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
