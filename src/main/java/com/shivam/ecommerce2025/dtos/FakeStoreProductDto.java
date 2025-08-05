package com.shivam.ecommerce2025.dtos;

import com.shivam.ecommerce2025.Models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String name;
    private String category;
    private String title;
    private Double price;
    private String description;
    private String imageurl;
}
