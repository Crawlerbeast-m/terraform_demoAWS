package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootEksApplication {


    @GetMapping("/")
    public String message() {
        return "Hello from Manish Rawat";
    }
    @GetMapping("/fargate")
    public String getFargate(){
        return "This application is running on AWS Fargate";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEksApplication.class, args);
    }

}
