package com.api.crud.resource.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.crud.services.exceptions.DataBaseException;
import com.api.crud.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException exception, HttpServletRequest request){
		String error = "Resource not found"; 
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError erro = new StandardError(Instant.now(), status.value(), error, exception.getMessage(), request.getRequestURI()); 
		return ResponseEntity.status(status).body(erro);
	}
	
	@ExceptionHandler(DataBaseException.class)
	public ResponseEntity<StandardError> dataBase(DataBaseException exception, HttpServletRequest request){
		String error = "Data base error"; 
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError erro = new StandardError(Instant.now(), status.value(), error, exception.getMessage(), request.getRequestURI()); 
		return ResponseEntity.status(status).body(erro);
	}
}
