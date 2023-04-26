package com.datafluence.sqlparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SqlParserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlParserApplication.class, args);
	}

}
