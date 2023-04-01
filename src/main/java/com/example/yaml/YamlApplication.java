package com.example.yaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class YamlApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(YamlApplication.class)
//				.properties("spring.config.location=" +
//						"classpath:/custom.yml" +
//						"file:/custom.yml")
//				.run(args);
		SpringApplication.run(YamlApplication.class, args);
	}

}
