package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.PolyPractice_LibraryController;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_Book;
import com.kh.practice.chap01_poly.model.vo.PolyPractice_Member;

public class PolyPractice_LibraryMenu {
	private PolyPractice_LibraryController lc = new PolyPractice_LibraryController(); // �ʱ�ȭ ����

	private Scanner sc = new Scanner(System.in); // �ʱ�ȭ ����

	public void mainMenu() {

		String name;
		int age;
		char gender;

		System.out.print("�̸� : ");
		name = sc.nextLine();

		System.out.print("���� : ");
		age = Integer.parseInt(sc.nextLine());

		System.out.print("���� : ");
		gender = sc.nextLine().charAt(0);

		lc.insertMember(new PolyPractice_Member(name, age, gender));

		while (true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ����������"); // LibraryController�� myInfo() ȣ���Ͽ� ���
			System.out.println("2. ���� ��ü ��ȸ"); // LibraryMenu�� selectAll() ȣ��
			System.out.println("3. ���� �˻�"); // LibraryMenu�� searchBook() ȣ��
			System.out.println("4. ���� �뿩�ϱ�"); // LibraryMenu�� rentBook() ȣ��
			System.out.println("9. ���α׷� �����ϱ�");

			System.out.print("�޴� ��ȣ : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;

			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
				continue;

			}
		}
	}

	public void selectAll() {

		PolyPractice_Book[] bList = new PolyPractice_Book[5];

		for (int i = 0; i < bList.length; i++) {
			bList[i] = lc.selectAll()[i];
			System.out.println(i + "�� ���� : " + bList[i].toString());
		}

	}

	public void searchBook() {

		PolyPractice_Book[] bList = new PolyPractice_Book[5];

		System.out.print("�˻��� Ű���� : ");
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

		System.out.println("�뿩�� ���� ��ȣ ���� : ");
		int index = Integer.parseInt(sc.nextLine());

		switch (lc.rentBook(index)) {

		case 0:
			System.out.println("���������� �뿩�Ͽ����ϴ�.");
			break;

		case 1:
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
			break;

		case 2:
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���");

		}

	}
}
