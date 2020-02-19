package com.minotore.iiexercise.dto;

import javax.validation.constraints.NotNull;

public class StockDTO {

	@NotNull
	private Long id;

	@NotNull
	private BookDTO book;

	@NotNull
	private LibraryDTO library;

	private int quantity; // if get null value then quantity = 0

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BookDTO getBook() {
		return book;
	}

	public void setBook(BookDTO book) {
		this.book = book;
	}

	public LibraryDTO getLibrary() {
		return library;
	}

	public void setLibrary(LibraryDTO library) {
		this.library = library;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
