package com.educaweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.curso.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{
	
}
