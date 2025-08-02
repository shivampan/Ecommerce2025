package com.shivam.ecommerce2025.Services;

import com.shivam.ecommerce2025.Models.Product;

import java.util.List;

public class FakeStoreProductService implements ProductService {

    @Override
    public Product getSingleProduct(Long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(Long productId) {
        return null;
    }
}
