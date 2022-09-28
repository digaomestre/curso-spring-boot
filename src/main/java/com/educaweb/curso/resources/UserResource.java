package com.educaweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educaweb.curso.entities.Usuario;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		
		Usuario u = new Usuario(1L, "Rodrigo", "rodrigo@gmail.com", "1234");
		
		return ResponseEntity.ok().body(u);
	}
	
}
