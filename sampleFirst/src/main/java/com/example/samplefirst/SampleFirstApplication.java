package com.example.samplefirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleFirstApplication.class, args);
        System.out.println("hi");
    }
}
