package com.shivam.ecommerce2025.ApplicationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
    @Bean
    public RestTemplate createRestTemplateBean(){
        return new RestTemplate();

    }
}
