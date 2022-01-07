package com.payten.crudExcampe.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;
/*
swagger ui icin ;
http://localhost:8080/swagger-ui.html#/
adresinden ulasabilirsiniz
 */

@Configuration
public class SwaggerConfig {
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "My Movie&Member CRUD API",
                "Swagger integration for API documents.",
                "API TOS",
                "Terms of service",
                new Contact("Kutay Polat", "www.example.com", "myeaddress@company.com"),
                "License of API",
                "API license URL",
                Collections.emptyList());
    }


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}
