package com.gv.shop.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

        @Bean
        public OpenAPI custumOpenAPI() {
                return new OpenAPI()
                                .info(new Info()
                                                .title("Ari'Ar shop API")
                                                .version("1.0")
                                                .description("API pour analyser les avis utilisateurs"));
        }
}