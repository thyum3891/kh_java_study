package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.PolyPractice_AniBook;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_Book;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_CookBook;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_Member;

public class PolyPractice_LibraryController {
	private PolyPractice_Member mem = null; // null�� ����ʱ�ȭ

	private PolyPractice_Book[] bList = new PolyPractice_Book[5]; // ũ�� 5 �Ҵ�
	{
		bList[0] = new PolyPractice_CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new PolyPractice_AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new PolyPractice_AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new PolyPractice_CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new PolyPractice_CookBook("������ �� �����غ�", "������", "�ұ�å", true);

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

				System.out.println("������������ �뿩 �Ұ�");
				
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
