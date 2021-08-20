package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.PolyPractice_AniBook;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_Book;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_CookBook;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_Member;

public class PolyPractice_LibraryController {
	private PolyPractice_Member mem = null; // null로 명시초기화

	private PolyPractice_Book[] bList = new PolyPractice_Book[5]; // 크기 5 할당
	{
		bList[0] = new PolyPractice_CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new PolyPractice_AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new PolyPractice_AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new PolyPractice_CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new PolyPractice_CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}

	public void insertMember(PolyPractice_Member mem) {

		this.mem = mem;

	}

	public PolyPractice_Member myInfo() {
		return mem;
	}

	public PolyPractice_Book[] selectAll() {

		return bList;

	}

	public PolyPractice_Book[] searchBook(String keyword) {
		int flag = 0;
		PolyPractice_Book[] book = new PolyPractice_Book[5];

		for (int i = 0; i < bList.length; i++) {

			if (bList[i].getTitle().contains(keyword)) {

				book[flag++] = bList[i];

			} else {

				continue;

			}
		}

		return book;
	}

	public int rentBook(int index) {

		int result = 0;

		if (bList[index] instanceof PolyPractice_AniBook) {

			if (((PolyPractice_AniBook) bList[index]).getAccessAge() > mem.getAge()) {

				System.out.println("나이제한으로 대여 불가");
				
				result = 1;

				}
		} else if (bList[index] instanceof PolyPractice_CookBook) {

			if (((PolyPractice_CookBook) (bList[index])).isCoupon() == true) {

				result = 2;

				mem.setCouponCount(mem.getCouponCount() + 1);

			}

		}

		return result;
	}
}
