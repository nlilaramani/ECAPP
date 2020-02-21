package com.ecomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.ecomm.*,com.ecomm.product.repo.*")
@EnableJpaRepositories("com.ecomm.product.repo")
public class EcappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcappApplication.class, args);
	}

}
