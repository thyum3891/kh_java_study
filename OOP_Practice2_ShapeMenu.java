package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.OOP_Practice2_SquareController;
import com.kh.hw.shape.controller.OOP_Practice2_TriangleController;

public class OOP_Practice2_ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private OOP_Practice2_SquareController scr = new OOP_Practice2_SquareController();
	private OOP_Practice2_TriangleController tc = new OOP_Practice2_TriangleController();

	public void inputMenu() {
		while (true) {

			System.out.println("==== 도형 프로그램 ====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");

			char menu = sc.nextLine().charAt(0);

			switch (menu) {
			case '3':
				triangleMenu();
				break;
			case '4':
				squareMenu();
				break;
			case '9':
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				continue;
			}
			break;
		}
	}

	public void triangleMenu() {
		while (true) {
			System.out.println("==== 삼각형 ====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");

			char menu = sc.nextLine().charAt(0);

			switch (menu) {

			case '1':
				inputSize(3, 1);
				continue;
			case '2':
				inputSize(3, 2);
				System.out.println("색이 수정되었습니다.");
				continue;
			case '3':
				printInformation(3);
				
				continue;
			case '9':
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				continue;
			}
			break;
		}
	}

	public void squareMenu() {
		while (true) {
			System.out.println("==== 사각형 ====");
			System.out.println("1.사각형 둘레");
			System.out.println("2.사각형 면적");
			System.out.println("3.사각형 색칠");
			System.out.println("4.사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");

			char menu = sc.nextLine().charAt(0);

			switch (menu) {

			case '1':
				inputSize(4, 1);
				continue;
			case '2':
				inputSize(4, 2);
				continue;
			case '3':
				inputSize(4, 3);
				System.out.println("색이 수정되었습니다.");
				continue;
			case '4':
				printInformation(4);
				continue;
			case '9':
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				continue;
			}
			break;
		}
	}

	public void inputSize(int type, int menuNum) {

		int height = 0;
		int width = 0;

		if (type == 3) {
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				height = Integer.parseInt(sc.nextLine());
				System.out.print("너비 : ");
				width = Integer.parseInt(sc.nextLine());
				System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
				break;

			case 2:
				System.out.print("색깔을 입력하세요 : ");
				tc.paintColor(sc.nextLine());
			}
		} else if(type==4){

			if (menuNum == 1|| menuNum == 2) {
				System.out.print("높이 : ");
				height = Integer.parseInt(sc.nextLine());
				System.out.print("너비 : ");
				width = Integer.parseInt(sc.nextLine());
			}

			{
				switch (menuNum) {
				case 1:
					System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
					break;
				case 2:
					System.out.println("사각형 면적 : " + scr.calcArea(height, width));
					break;
				case 3:
					System.out.print("색깔을 입력하세요 : ");
					scr.paintColor(sc.nextLine());
					break;
				}
			}

		}

	}

	public void printInformation(int type) {

		if (type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(scr.print());
		}

	}

}
