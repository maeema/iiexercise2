package com.minotore.iiexercise.dto;

import javax.validation.constraints.NotNull;

public class AuthorDTO {
	
	@NotNull
	private Long id;
	@NotNull
	private String name;
	@NotNull
	private int age;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
