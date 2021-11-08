package com.api.gel.services.excepitions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException (Object id) {
		super ("Resources not found id"+ id);
	}
}
