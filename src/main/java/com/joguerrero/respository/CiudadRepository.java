package com.joguerrero.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joguerrero.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {

}
