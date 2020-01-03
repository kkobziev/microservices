package org.example.microservices.limits;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("currency-exchange-service")
@Data
@NoArgsConstructor
public class LimitsConfiguration {
    private int minimum;
    private int maximum;
}
