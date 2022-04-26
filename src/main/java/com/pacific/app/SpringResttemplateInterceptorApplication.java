package com.pacific.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({ "com.pacific.*" })
@ConfigurationPropertiesScan("com.pacific.config")
public class SpringResttemplateInterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringResttemplateInterceptorApplication.class, args);
	}

}
