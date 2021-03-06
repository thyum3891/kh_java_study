package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.OOP_Practice_EmployeeController;

public class OOP_Practice_EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private OOP_Practice_EmployeeController ec = new OOP_Practice_EmployeeController();

	public OOP_Practice_EmployeeMenu() {
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");

			System.out.print("메뉴 번호를 누르세요 : ");
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
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				continue;
			}

		}
	}

	public void insertEmp() {
		System.out.print("사원 번호 : ");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.print("사원 이름 : ");
		String empName = sc.nextLine();

		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		while (true) {
			System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
			char selectMenu = (sc.nextLine().toUpperCase()).charAt(0);

			if (selectMenu == 'Y') {
				System.out.print("사원 부서명 : ");
				String dept = sc.nextLine();
				System.out.print("사원 연봉 : ");
				int salary = Integer.parseInt(sc.nextLine());
				System.out.print("사원 보너스 : ");
				double bonus = Double.parseDouble(sc.nextLine());

				ec.add(empNo, empName, gender, phone, dept, salary, bonus);

			} else if (selectMenu == 'N') {
				ec.add(empNo, empName, gender, phone);
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;

		}

//		empNo, name, gender, phone, dept, salary, bonus

	}

	public void updateEmp() {
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int selectMenu = Integer.parseInt(sc.nextLine());

		switch (selectMenu) {
		case 1:
			System.out.print("수정할 전화번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;

		case 2:
			System.out.print("수정할 사원연봉 : ");
			int salary = Integer.parseInt(sc.nextLine());
			ec.modify(salary);
			break;

		case 3:
			System.out.print("수정할 보너스 율");
			double bonus = Double.parseDouble(sc.nextLine());
			ec.modify(bonus);
			break;

		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			break;

		default:
			System.out.println("잘못입력하셨습니다.");
			break;

		}

	}

	public void deleteEmp() {
		while (true) {
			System.out.print("정말로 삭제하시겠습니까?(y/n) : ");
			char selectMenu = (sc.nextLine().toUpperCase()).charAt(0);

			if (selectMenu == 'Y') {
				ec.remove();
				if (ec.inform() == null) {
					System.out.println("삭제에 성공하셨습니다.");

				} else {
					System.out.println("삭제에 실패하셨습니다.");
				}
			} else if (selectMenu == 'N') {
				System.out.println("메인메뉴로 돌아갑니다.");

			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;

		}

	}

	public void printEmp() {

		if (ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다.");
		} else {
			System.out.println(ec.inform());
		}

	}
}
