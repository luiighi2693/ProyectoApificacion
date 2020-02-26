package com.banesco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoWebApplication extends SpringBootServletInitializer {
//public class DemoWebApplication{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoWebApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}
}
