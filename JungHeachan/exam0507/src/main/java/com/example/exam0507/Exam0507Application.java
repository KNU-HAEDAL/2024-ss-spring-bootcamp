package com.example.exam0507;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Exam0507Application {

    public static void main(String[] args) {
        SpringApplication.run(Exam0507Application.class, args);
    }

}
