package com.educaweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educaweb.curso.entities.Usuario;
import com.educaweb.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<Usuario> findAll() {
		
		return repository.findAll();
		
	}
	
	public Usuario findById(Long id) {
	
		Optional<Usuario> obj = repository.findById(id);
		return obj.get();
	}
	
}
