package com.shivam.ecommerce2025.Services;

import com.shivam.ecommerce2025.Models.Category;
import com.shivam.ecommerce2025.Models.Product;
import com.shivam.ecommerce2025.dtos.FakeStoreProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
//The real class where the code will be written to call the FakeStoreApis
@Service
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productid) {
        ResponseEntity<FakeStoreProductDto> fakeStoreProductDtoResponseEntity = restTemplate.getForEntity("https://fakestoreapi.in/api/products" + productid,
                FakeStoreProductDto.class);
        FakeStoreProductDto fakeStoreProductDto = fakeStoreProductDtoResponseEntity.getBody();

        //Convert FakeStoreProductDto into Project Object
        return FakeStoreProductDtotoFakeStoreProduct(fakeStoreProductDto);

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

    private static Product FakeStoreProductDtotoFakeStoreProduct(FakeStoreProductDto fakeStoreProductDto){
        if(fakeStoreProductDto == null) return null;
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImageurl(fakeStoreProductDto.getImageurl());
        product.setDescription(fakeStoreProductDto.getDescription());

        Category category = new Category();
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);

        return product;

    }
}
