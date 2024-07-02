package com.cumple.gsc;

import com.cumple.gsc.config.OpenAPIConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(OpenAPIConfiguration.class)
public class GscApplication {

	public static void main(String[] args) {
		SpringApplication.run(GscApplication.class, args);
	}

}
