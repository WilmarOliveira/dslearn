package com.devsuperior.dslearn.resources.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthCustomError implements Serializable {
	private static final long serialVersionUID = 1L;

	private String error;
	
	@JsonProperty("error_description")
	private String errorDescritpion;
	
	public OAuthCustomError() {
		
	}

	public OAuthCustomError(String error, String errorDescritpion) {
		super();
		this.error = error;
		this.errorDescritpion = errorDescritpion;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorDescritpion() {
		return errorDescritpion;
	}

	public void setErrorDescritpion(String errorDescritpion) {
		this.errorDescritpion = errorDescritpion;
	}

}
