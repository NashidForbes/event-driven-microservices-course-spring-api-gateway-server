package com.appsdeveloperblog.estore.apigateway.rest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplate {
    @Bean
    public org.springframework.web.client.RestTemplate myRestTemplate() {
        return new RestTemplateBuilder()
                .rootUri("http://localhost:8082")
                .build();
    }
}
