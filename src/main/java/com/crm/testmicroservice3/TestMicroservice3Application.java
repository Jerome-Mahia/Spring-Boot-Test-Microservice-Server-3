package com.crm.testmicroservice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestMicroservice3Application {

    public static void main(String[] args) {
        SpringApplication.run(TestMicroservice3Application.class, args);
    }

}
