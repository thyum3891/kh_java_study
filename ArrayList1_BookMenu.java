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

		menu.append("******* ���� �޴� *******\n");
		menu.append("1. �� ���� �߰�\n");
		menu.append("2. ���� ��ü ��ȸ\n");
		menu.append("3. ���� �˻� ��ȸ\n");
		menu.append("4. ���� ����\n");
		menu.append("5. ���� �� �������� ����\n");
		menu.append("9. ����\n");
		menu.append("�޴� ��ȣ ���� : ");

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

		System.out.print("������ : ");
		String title = util.inputScanStr();
		System.out.print("���ڸ� : ");
		String author = util.inputScanStr();
		while (true) {
			System.out.print("�帣(1.�ι� / 2.�ڿ����� / 3.�Ƿ� / 4.��Ÿ) : ");
			int categoryNum = util.inputScanInt();
			switch (categoryNum) {
			case 1:
				category = "�ι�";
				break;
			case 2:
				category = "�ڿ�����";
				break;
			case 3:
				category = "�Ƿ�";
				break;
			case 4:
				category = "��Ÿ";
				break;
			default:
				System.out.println("�ٽ��Է����ּ���.");
				continue;

			}
			break;
		}
		System.out.print("���� : ");
		int price = (int) (util.inputScanInt());

		bc.insertBook(new ArrayList1_Book(title, author, category, price));

	}

	public void selectList() {

		ArrayList<ArrayList1_Book> bookList = new ArrayList<ArrayList1_Book>();

		bookList.addAll(bc.selectList());

		if (bookList.isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i).toString());
			}
		}

	}

	public void searchBook() {
		System.out.print("�˻��� ������ : ");
		String keyword = util.inputScanStr();
		ArrayList<ArrayList1_Book> searchList = new ArrayList<ArrayList1_Book>();

		searchList.addAll(bc.searchBook(keyword));

		if (searchList.isEmpty()) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {

				System.out.println(searchList.get(i).toString());
				System.out.println("22");
			}
		}

	}

	public void deleteBook() {
		System.out.print("������ ������ : ");
		String title = util.inputScanStr();
		System.out.print("������ ���ڸ� : ");
		String author = util.inputScanStr();
		ArrayList1_Book remove = new ArrayList1_Book();

		remove = bc.deleteBook(title, author);

		if (remove == null) {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		} else {
			System.out.println("���������� �����Ͽ����ϴ�.");
		}

	}

	public int ascBook() {
		return bc.ascBook();
	}

}
