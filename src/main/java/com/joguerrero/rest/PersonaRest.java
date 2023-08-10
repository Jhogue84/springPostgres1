package com.joguerrero.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joguerrero.model.Persona;
import com.joguerrero.service.PersonaService;

@RestController
@RequestMapping("/personas/")
public class PersonaRest {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas(){
		return ResponseEntity.ok(personaService.findAll());
	}
	
	private ResponseEntity<Persona> savePersona(@RequestBody Persona persona){
		
		Persona personaGuardar = personaService.save(persona);
		try {
			return ResponseEntity.created(new URI("/personas/"+personaGuardar.getId())).body(personaGuardar);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
				
	}

}
