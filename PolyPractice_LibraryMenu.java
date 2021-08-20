package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.PolyPractice_LibraryController;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_Book;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_Member;

public class PolyPractice_LibraryMenu {
	private PolyPractice_LibraryController lc = new PolyPractice_LibraryController(); // 초기화 생성

	private Scanner sc = new Scanner(System.in); // 초기화 생성

	public void mainMenu() {

		String name;
		int age;
		char gender;

		System.out.print("이름 : ");
		name = sc.nextLine();

		System.out.print("나이 : ");
		age = Integer.parseInt(sc.nextLine());

		System.out.print("성별 : ");
		gender = sc.nextLine().charAt(0);

		lc.insertMember(new PolyPractice_Member(name, age, gender));

		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 마이페이지"); // LibraryController의 myInfo() 호출하여 출력
			System.out.println("2. 도서 전체 조회"); // LibraryMenu의 selectAll() 호출
			System.out.println("3. 도서 검색"); // LibraryMenu의 searchBook() 호출
			System.out.println("4. 도서 대여하기"); // LibraryMenu의 rentBook() 호출
			System.out.println("9. 프로그램 종료하기");

			System.out.print("메뉴 번호 : ");
			int selectNum = Integer.parseInt(sc.nextLine());

			switch (selectNum) {
			case 1:
				System.out.println(lc.myInfo().toString());
				break;

			case 2:
				selectAll();
				break;

			case 3:
				searchBook();
				break;

			case 4:
				rentBook();
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
				continue;

			}
		}
	}

	public void selectAll() {

		PolyPractice_Book[] bList = new PolyPractice_Book[5];

		for (int i = 0; i < bList.length; i++) {
			bList[i] = lc.selectAll()[i];
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}

	}

	public void searchBook() {

		PolyPractice_Book[] bList = new PolyPractice_Book[5];

		System.out.print("검색할 키워드 : ");
		String keyword = sc.nextLine();

		for (int i = 0; i < bList.length; i++) {

			if (lc.searchBook(keyword)[i] == null) {
				break;
			}

			bList[i] = lc.searchBook(keyword)[i];
			System.out.println(bList[i].toString());
		}

	}

	public void rentBook() {

		selectAll();

		System.out.println("대여할 도서 번호 선택 : ");
		int index = Integer.parseInt(sc.nextLine());

		switch (lc.rentBook(index)) {

		case 0:
			System.out.println("성공적으로 대여하였습니다.");
			break;

		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;

		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");

		}

	}
}
