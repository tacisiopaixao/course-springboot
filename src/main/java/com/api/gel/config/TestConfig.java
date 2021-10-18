package com.api.gel.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.gel.entities.User;
import com.api.gel.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(0, "tarcisio", "tarcisio@gmail.com", "999665593", "1234");
		User u2 = new User(0, "Nara", "Nara@gmail.com", "998072849", "4321");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}

}
