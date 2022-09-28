package com.educaweb.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educaweb.curso.entities.Usuario;
import com.educaweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Rodrigo", "rodrigo@gmail.com.br", "31986096487", "1234");
		Usuario u2 = new Usuario(null, "Beth", "beth@gmail.com.br", "31986646485", "1234");
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
