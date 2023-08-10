package com.joguerrero.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joguerrero.model.Departamento;
import com.joguerrero.service.DepartamentoService;

@RestController
@RequestMapping("/departamentos/")
public class DepartamentoRest {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping	
	public ResponseEntity<List<Departamento>> getAllDepartamentos(){
		return ResponseEntity.ok(departamentoService.findAll());
		
	}
	
}
