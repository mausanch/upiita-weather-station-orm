package com.ipn.upiita.weatherstation;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.ipn.upiita.weatherstation.model.entity")
public class configuration {
    
}
