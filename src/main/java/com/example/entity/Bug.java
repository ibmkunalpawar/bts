package com.example.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Bug {
	
	private String id;
	@NotNull
	@NotBlank
	private String description;
	@NotNull
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
