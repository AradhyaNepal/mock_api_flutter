package com.a2.mock_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MockApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockApiApplication.class, args);
	}

}
