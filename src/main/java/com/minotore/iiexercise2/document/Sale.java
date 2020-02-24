package com.minotore.iiexercise2.document;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sale implements Serializable {

	/**
	 * define Sale
	 */
	private static final long serialVersionUID = 447837589384506486L;
	
	private String libraryName;
	private String bookName;
	private Double bookPrice;
	private int unitsSold;

	public Sale() {
		super();
	}

	public Sale(String libraryName, String bookName, Double bookPrice, int unitsSold) {
		super();
		this.libraryName = libraryName;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.unitsSold = unitsSold;
	}

	
	
	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(int unitsSold) {
		this.unitsSold = unitsSold;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((bookPrice == null) ? 0 : bookPrice.hashCode());
		result = prime * result + ((libraryName == null) ? 0 : libraryName.hashCode());
		result = prime * result + unitsSold;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookPrice == null) {
			if (other.bookPrice != null)
				return false;
		} else if (!bookPrice.equals(other.bookPrice))
			return false;
		if (libraryName == null) {
			if (other.libraryName != null)
				return false;
		} else if (!libraryName.equals(other.libraryName))
			return false;
		if (unitsSold != other.unitsSold)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sale [libraryName=" + libraryName + ", bookName=" + bookName + ", bookPrice=" + bookPrice
				+ ", unitsSold=" + unitsSold + "]";
	}

}
