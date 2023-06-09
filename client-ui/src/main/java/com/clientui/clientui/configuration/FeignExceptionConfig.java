package com.clientui.clientui.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.clientui.clientui.exceptions.CustomerErrorDecoder;

@Configuration
public class FeignExceptionConfig {
    @Bean
    public CustomerErrorDecoder mCustomerErrorDecoder() {
        return new CustomerErrorDecoder();
    }
}
