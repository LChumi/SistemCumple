package com.cumple.gsc.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration{

    @Bean
    public OpenAPI expenseApi() {
        return new OpenAPI()
                .info(new Info().title("Importadora cumpleaños API")
                        .description("API de importadora cumpleaños ASSIST WEB")
                        .version("v0.0.1")
                        .license(new License().name("Apache License Version 2.0").url("https://www.apache.org/licenses/LICENSE-2.0"))
                ).externalDocs(new ExternalDocumentation()
                        .description("Assist WEB")
                        .url("https://www.apache.org/licenses/LICENSE-2.0"));
    }

    @Bean
    public GroupedOpenApi publicApi(){
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/public//**")
                .build();
    }

    @Bean
    public GroupedOpenApi adminApi(){
        return GroupedOpenApi.builder()
                .group("adimn")
                .pathsToMatch("/admin/**")
                .build();
    }

}
