package com.example.medicineservice.common.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
//                .addServersItem(new Server().url("http://localhost:8080/api/medicine"))
                .addServersItem(new Server().url("https://singularly-holy-aphid.ngrok-free.app/api/medicine")); // Gateway URL
    }
}

