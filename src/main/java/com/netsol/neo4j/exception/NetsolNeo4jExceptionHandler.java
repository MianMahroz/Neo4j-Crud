package com.netsol.neo4j.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class NetsolNeo4jExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<?> handleAllExceptions(Exception ex) {
		return new ResponseEntity(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
