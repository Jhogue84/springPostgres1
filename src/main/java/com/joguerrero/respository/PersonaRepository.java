package com.joguerrero.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joguerrero.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
