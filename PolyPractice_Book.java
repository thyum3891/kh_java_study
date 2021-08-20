package com.kh.practice.chap01_poly.model.vo;

public class PolyPractice_Book {
	private String title; // ������
	private String author; // ���ڸ�
	private String publisher; // ���ǻ��

	public PolyPractice_Book() {

	}

	public PolyPractice_Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;

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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return title + " / " + author + " / " + publisher;
	}

}
