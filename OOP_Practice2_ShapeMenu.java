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

			System.out.println("==== ���� ���α׷� ====");
			System.out.println("3. �ﰢ��");
			System.out.println("4. �簢��");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");

			char menu = sc.nextLine().charAt(0);

			switch (menu) {
			case '3':
				triangleMenu();
				break;
			case '4':
				squareMenu();
				break;
			case '9':
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			break;
		}
	}

	public void triangleMenu() {
		while (true) {
			System.out.println("==== �ﰢ�� ====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");

			char menu = sc.nextLine().charAt(0);

			switch (menu) {

			case '1':
				inputSize(3, 1);
				continue;
			case '2':
				inputSize(3, 2);
				System.out.println("���� �����Ǿ����ϴ�.");
				continue;
			case '3':
				printInformation(3);
				
				continue;
			case '9':
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			break;
		}
	}

	public void squareMenu() {
		while (true) {
			System.out.println("==== �簢�� ====");
			System.out.println("1.�簢�� �ѷ�");
			System.out.println("2.�簢�� ����");
			System.out.println("3.�簢�� ��ĥ");
			System.out.println("4.�簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");

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
				System.out.println("���� �����Ǿ����ϴ�.");
				continue;
			case '4':
				printInformation(4);
				continue;
			case '9':
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
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
				System.out.print("���� : ");
				height = Integer.parseInt(sc.nextLine());
				System.out.print("�ʺ� : ");
				width = Integer.parseInt(sc.nextLine());
				System.out.println("�ﰢ�� ���� : " + tc.calcArea(height, width));
				break;

			case 2:
				System.out.print("������ �Է��ϼ��� : ");
				tc.paintColor(sc.nextLine());
			}
		} else if(type==4){

			if (menuNum == 1|| menuNum == 2) {
				System.out.print("���� : ");
				height = Integer.parseInt(sc.nextLine());
				System.out.print("�ʺ� : ");
				width = Integer.parseInt(sc.nextLine());
			}

			{
				switch (menuNum) {
				case 1:
					System.out.println("�簢�� �ѷ� : " + scr.calcPerimeter(height, width));
					break;
				case 2:
					System.out.println("�簢�� ���� : " + scr.calcArea(height, width));
					break;
				case 3:
					System.out.print("������ �Է��ϼ��� : ");
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
