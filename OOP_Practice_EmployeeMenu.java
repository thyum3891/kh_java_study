package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.OOP_Practice_EmployeeController;

public class OOP_Practice_EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private OOP_Practice_EmployeeController ec = new OOP_Practice_EmployeeController();

	public OOP_Practice_EmployeeMenu() {
		while (true) {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����");

			System.out.print("�޴� ��ȣ�� �������� : ");
			int selectMenu = Integer.parseInt(sc.nextLine());

			switch (selectMenu) {

			case 1:
				insertEmp();
				break;

			case 2:
				updateEmp();
				break;

			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;

			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				continue;
			}

		}
	}

	public void insertEmp() {
		System.out.print("��� ��ȣ : ");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.print("��� �̸� : ");
		String empName = sc.nextLine();

		System.out.print("��� ���� : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		while (true) {
			System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
			char selectMenu = (sc.nextLine().toUpperCase()).charAt(0);

			if (selectMenu == 'Y') {
				System.out.print("��� �μ��� : ");
				String dept = sc.nextLine();
				System.out.print("��� ���� : ");
				int salary = Integer.parseInt(sc.nextLine());
				System.out.print("��� ���ʽ� : ");
				double bonus = Double.parseDouble(sc.nextLine());

				ec.add(empNo, empName, gender, phone, dept, salary, bonus);

			} else if (selectMenu == 'N') {
				ec.add(empNo, empName, gender, phone);
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			break;

		}

//		empNo, name, gender, phone, dept, salary, bonus

	}

	public void updateEmp() {
		System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� ��");
		System.out.println("9. ���ư���");
		System.out.print("�޴� ��ȣ�� �������� : ");
		int selectMenu = Integer.parseInt(sc.nextLine());

		switch (selectMenu) {
		case 1:
			System.out.print("������ ��ȭ��ȣ : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;

		case 2:
			System.out.print("������ ������� : ");
			int salary = Integer.parseInt(sc.nextLine());
			ec.modify(salary);
			break;

		case 3:
			System.out.print("������ ���ʽ� ��");
			double bonus = Double.parseDouble(sc.nextLine());
			ec.modify(bonus);
			break;

		case 9:
			System.out.println("���θ޴��� ���ư��ϴ�.");
			break;

		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;

		}

	}

	public void deleteEmp() {
		while (true) {
			System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) : ");
			char selectMenu = (sc.nextLine().toUpperCase()).charAt(0);

			if (selectMenu == 'Y') {
				ec.remove();
				if (ec.inform() == null) {
					System.out.println("������ �����ϼ̽��ϴ�.");

				} else {
					System.out.println("������ �����ϼ̽��ϴ�.");
				}
			} else if (selectMenu == 'N') {
				System.out.println("���θ޴��� ���ư��ϴ�.");

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			break;

		}

	}

	public void printEmp() {

		if (ec.inform() == null) {
			System.out.println("��� �����Ͱ� �����ϴ�.");
		} else {
			System.out.println(ec.inform());
		}

	}
}
