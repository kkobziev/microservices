package org.example.microservices.limits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfiguration configuration;

    @GetMapping("/limits")
    public LimitResponse retrieveLimitsFromConfigurations() {
        LimitResponse limitResponse = new LimitResponse(configuration.getMaximum(),
                configuration.getMinimum());

        return limitResponse;
    }

}
