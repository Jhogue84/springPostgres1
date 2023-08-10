package com.joguerrero.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joguerrero.model.Ciudad;
import com.joguerrero.service.CiudadService;

@RestController
@RequestMapping("/ciudades/")
public class CiudadRest {
	
	@Autowired
	private CiudadService ciudadService;
	
	
	@GetMapping("{id}")
	public ResponseEntity<List<Ciudad>> getAllCiudadByDepartamento(@PathVariable("id") Long id){
		return ResponseEntity.ok(ciudadService.findAllCiudadByDepartamento(id));
	}

}
