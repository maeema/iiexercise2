package com.minotore.iiexercise.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class BookDTO {

	@NotNull
	private long id;

	@NotNull
	private String name;

	@NotNull
	private Double price;

	private Long totalUnitSold;

	@NotNull
	private BookCategory category;

	@NotNull
	private Date publicationDate;

	@NotNull
	private Integer numberOfPages;

	@NotNull
	private AuthorDTO author;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getTotalUnitSold() {
		return totalUnitSold;
	}

	public void setTotalUnitSold(Long totalUnitSold) {
		this.totalUnitSold = totalUnitSold;
	}

	public BookCategory getCategory() {
		return category;
	}

	public void setCategory(BookCategory category) {
		this.category = category;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", name=" + name + ", price=" + price + ", totalUnitSold=" + totalUnitSold
				+ ", category=" + category + ", publicationDate=" + publicationDate + ", numberOfPages=" + numberOfPages
				+ ", author=" + author + "]";
	}

}
