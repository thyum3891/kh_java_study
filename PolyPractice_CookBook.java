package com.kh.practice.chap01_poly.model.vo;

public class PolyPractice_CookBook extends PolyPractice_Book {
	private boolean coupon; // 요리학원쿠폰유무

	public PolyPractice_CookBook() {
	}

	public PolyPractice_CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

}
