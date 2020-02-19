package com.minotore.iiexercise.dto;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.NotNull;

public class MagazineDTO extends BookDTO {
	
	@NotNull
	private Date nextReleaseDate;
	
	private Set<String> keySubjects;

	public Date getNextReleaseDate() {
		return nextReleaseDate;
	}

	public void setNextReleaseDate(Date nextReleaseDate) {
		this.nextReleaseDate = nextReleaseDate;
	}

	public Set<String> getKeySubjects() {
		return keySubjects;
	}

	public void setKeySubjects(Set<String> keySubjects) {
		this.keySubjects = keySubjects;
	}

}
