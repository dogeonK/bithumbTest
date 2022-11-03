package com.example.test_bithumb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TestBithumbApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestBithumbApplication.class, args);

    }

}
