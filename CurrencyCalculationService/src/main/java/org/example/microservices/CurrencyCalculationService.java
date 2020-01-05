package org.example.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("org.example.microservices")
@EnableDiscoveryClient
public class CurrencyCalculationService {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyCalculationService.class, args);
    }
}
