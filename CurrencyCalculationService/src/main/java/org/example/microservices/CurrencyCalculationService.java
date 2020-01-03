package org.example.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrencyCalculationService {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyCalculationService.class, args);
    }
}
