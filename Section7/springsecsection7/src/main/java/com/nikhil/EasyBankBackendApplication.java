package com.nikhil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories("com.nikhil.repository")  --- optional to enable jpa repositories
//@EntityScan("com.nikhil.model")  --- optional to scan entities
//@EnableWebSecurity --- required in spring application and optional for spring boot application
public class EasyBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyBankBackendApplication.class, args);
	}


}
