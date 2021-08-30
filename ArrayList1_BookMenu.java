package com.kh.practice.list.library.view;

import java.util.ArrayList;

import com.kh.practice.list.library.controller.ArrayList1_BookController;
import com.kh.practice.list.library.model.vo.ArrayList1_Book;
import com.kh.practice.list.util.ArrayList1_Util;

public class ArrayList1_BookMenu {

	private ArrayList1_BookController bc = new ArrayList1_BookController();
	private ArrayList1_Util util = new ArrayList1_Util();

	private void menu() {

		StringBuffer menu = new StringBuffer();

		menu.append("******* 메인 메뉴 *******\n");
		menu.append("1. 새 도서 추가\n");
		menu.append("2. 도서 전체 조회\n");
		menu.append("3. 도서 검색 조회\n");
		menu.append("4. 도서 삭제\n");
		menu.append("5. 도서 명 오름차순 정렬\n");
		menu.append("9. 종료\n");
		menu.append("메뉴 번호 선택 : ");

		System.out.print(menu);
	}

	public void mainMenu() {
		while (true) {
			menu();
			int selectMenu = new ArrayList1_Util().inputScanInt();
			switch (selectMenu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				ascBook();
				return;
			default:
				continue;
			}

		}
	}

	public void insertBook() {

		String category;

		System.out.print("도서명 : ");
		String title = util.inputScanStr();
		System.out.print("저자명 : ");
		String author = util.inputScanStr();
		while (true) {
			System.out.print("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
			int categoryNum = util.inputScanInt();
			switch (categoryNum) {
			case 1:
				category = "인문";
				break;
			case 2:
				category = "자연과학";
				break;
			case 3:
				category = "의료";
				break;
			case 4:
				category = "기타";
				break;
			default:
				System.out.println("다시입력해주세요.");
				continue;

			}
			break;
		}
		System.out.print("가격 : ");
		int price = (int) (util.inputScanInt());

		bc.insertBook(new ArrayList1_Book(title, author, category, price));

	}

	public void selectList() {

		ArrayList<ArrayList1_Book> bookList = new ArrayList<ArrayList1_Book>();

		bookList.addAll(bc.selectList());

		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i).toString());
			}
		}

	}

	public void searchBook() {
		System.out.print("검색할 도서명 : ");
		String keyword = util.inputScanStr();
		ArrayList<ArrayList1_Book> searchList = new ArrayList<ArrayList1_Book>();

		searchList.addAll(bc.searchBook(keyword));

		if (searchList.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {

				System.out.println(searchList.get(i).toString());
				System.out.println("22");
			}
		}

	}

	public void deleteBook() {
		System.out.print("삭제할 도서명 : ");
		String title = util.inputScanStr();
		System.out.print("삭제할 저자명 : ");
		String author = util.inputScanStr();
		ArrayList1_Book remove = new ArrayList1_Book();

		remove = bc.deleteBook(title, author);

		if (remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else {
			System.out.println("성공적으로 삭제하였습니다.");
		}

	}

	public int ascBook() {
		return bc.ascBook();
	}

}
