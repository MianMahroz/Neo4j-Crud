package com.netsol.neo4j.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netsol.neo4j.domain.HIRED;
import com.netsol.neo4j.dto.HiredDto;
import com.netsol.neo4j.repositories.HIREDRepository;
import com.netsol.neo4j.services.HIREDService;

@RestController
@RequestMapping("/api")
public class HireController {

	@Autowired
	private HIREDService hiredService;

	@Autowired
	private HIREDRepository hireRepository;

	@PostMapping("/hired")
	public @ResponseBody ResponseEntity saveHIRED_Relation(@RequestBody HiredDto hiredDto) {
		return new ResponseEntity(hiredService.saveHired(hiredDto), HttpStatus.CREATED);
	}

	@GetMapping("/hired")
	public Iterable<HIRED> getHIRED_Relation() {
		return hireRepository.findAll();
	}

}
