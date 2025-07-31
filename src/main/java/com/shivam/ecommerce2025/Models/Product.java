package com.shivam.ecommerce2025.Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{

    private String title;
    private Double price;
    private String description;
    private String imageurl;
    private Category category;

}
