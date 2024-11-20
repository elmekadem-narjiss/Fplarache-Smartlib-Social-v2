package com.example.social_serice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Social Service API", version = "1.0", description = "Documentation des APIs de Social Service"))
public class SocialSericeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialSericeApplication.class, args);
    }

}
