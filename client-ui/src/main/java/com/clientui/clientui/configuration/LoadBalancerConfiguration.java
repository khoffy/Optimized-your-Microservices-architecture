package com.clientui.clientui.configuration;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


public class LoadBalancerConfiguration {

    @Bean
    public ServiceInstanceListSupplier discoveryClientServiceInstanceListSupplier(
            ConfigurableApplicationContext context) {
        return ServiceInstanceListSupplier.builder()
                //.withBlockingDiscoveryClient()
                //.withSameInstancePreference()
                .withDiscoveryClient()
                .withHealthChecks()
                .build(context);
    }
}
