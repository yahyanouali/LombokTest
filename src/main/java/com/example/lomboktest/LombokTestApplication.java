package com.example.lomboktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lomboktest.model.User;
import com.example.lomboktest.repository.UserRepository;

@SpringBootApplication
public class LombokTestApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(LombokTestApplication.class);

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(LombokTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("début du traitement...");
		
		User user = new User();
		user.setFirstName("Yahya");
		user.setLastName("Nouali");
		user.setAge(33);
		userRepository.save(user);
		
		LOGGER.info("fin du traitment...");
	}

}
