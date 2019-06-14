package com.onepiece.mogens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MogensApplication {

    public static void main(String[] args) {
        SpringApplication.run(MogensApplication.class, args);
    }

}
