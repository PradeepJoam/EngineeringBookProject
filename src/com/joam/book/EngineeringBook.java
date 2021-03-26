package com.joam.book;
public class EngineeringBook extends Book {

	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "EngineeringBook [ BookNo="+ getBookNo() + ", Title=" + getTitle() + ", Author=" + getAuthor() + ", Price="
				+ getPrice() + "Category=" +  getCategory() + "]";
	}

	
}
