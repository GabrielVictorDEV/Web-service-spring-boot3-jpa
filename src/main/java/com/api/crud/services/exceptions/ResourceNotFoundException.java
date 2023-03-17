package com.api.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("O id informado não foi encontrado. Id: " + id); 
	}
}
