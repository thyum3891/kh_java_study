package com.kh.practice.list.library.model.vo;

public class ArrayList1_Book implements Comparable<ArrayList1_Book>, Cloneable {

	private String title;
	private String author;
	private String category;
	private int price;

	public ArrayList1_Book() {
		super();
	}

	public ArrayList1_Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}

	public int hashCode() {
		return this.hashCode();

	}

	public boolean equals() {
		return this.equals();

	}

	@Override
	public int compareTo(ArrayList1_Book o) {
		int result = this.getTitle().compareTo(o.getTitle());
		return result;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}

	}

}
