package com.example.mongocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class MongoCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoCrudApplication.class, args);
    }

}
