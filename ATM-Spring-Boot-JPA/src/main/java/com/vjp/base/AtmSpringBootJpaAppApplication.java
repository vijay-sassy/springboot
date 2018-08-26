package com.vjp.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author VIJAY P S
 * This is the base class of the REST API with
 * which the application runs
 *
 */
@SpringBootApplication //The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes,
@ComponentScan({"com.vjp.service","com.vjp.base.apicontroller"}) //Automatic detection of beans for autowiring
@EntityScan("com.vjp.entity") //used to identify JPA entities
@EnableJpaRepositories("com.vjp.repository") //Enables and scans for Spring Data repositories
public class AtmSpringBootJpaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmSpringBootJpaAppApplication.class, args);
	}
}
