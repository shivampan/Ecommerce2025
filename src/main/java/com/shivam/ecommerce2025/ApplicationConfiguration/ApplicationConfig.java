package com.shivam.ecommerce2025.ApplicationConfiguration;

import org.springframework.web.client.RestTemplate;

public class ApplicationConfig {
    public RestTemplate createRestTemplateBean(){
        return new RestTemplate();

    }
}
