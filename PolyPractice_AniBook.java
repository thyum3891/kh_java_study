package com.kh.practice.chap01_poly.model.vo;

public class PolyPractice_AniBook extends PolyPractice_Book {

	private int accessAge; // 제한 나이

	public PolyPractice_AniBook() {
	}

	public PolyPractice_AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + accessAge;
	}

}
