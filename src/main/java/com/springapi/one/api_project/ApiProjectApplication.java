package com.springapi.one.api_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiProjectApplication   extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiProjectApplication.class, args);
	}

	@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      return builder.sources(ApiProjectApplication.class);
  }

}
