package com.netsol.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
//@EnableNeo4jRepositories("com.netsol.neo4j.repositories")
//@SpringBootApplication(scanBasePackages = { "com.netsol" })
//@EntityScan("com.netsol")
//@PropertySource(value = { "classpath:application.properties" })
public class SpringBootNeo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNeo4jApplication.class, args);
	}
}
