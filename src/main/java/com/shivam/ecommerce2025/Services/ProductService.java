package com.shivam.ecommerce2025.Services;

import com.shivam.ecommerce2025.Models.Product;
import com.shivam.ecommerce2025.exceptions.ProductNotFoundException;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id) throws ProductNotFoundException;
    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product deleteProduct(Long productId);

}
