package com.prahlad.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prahlad.jpa.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityPracticeDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityPracticeDbApplication.class, args);
	}

}
