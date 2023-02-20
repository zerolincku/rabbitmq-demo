package com.linck.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author linck
 * @date 2023-02-20
 */
@SpringBootApplication
@EnableScheduling
public class ProductionApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductionApplication.class, args);
    }

}
