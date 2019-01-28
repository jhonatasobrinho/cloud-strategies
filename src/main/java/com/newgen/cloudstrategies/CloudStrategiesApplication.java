package com.newgen.cloudstrategies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class CloudStrategiesApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudStrategiesApplication.class, args);
    }
}
