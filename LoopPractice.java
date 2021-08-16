package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	static Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("=========1��° ����=======");
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num > 0) {
			for (int i = 1; i < num + 1; i++) {
				System.out.println(i + " ");
			}
		} else {
			System.out.println("�Է��Ͻ� ���� 1���� �۽��ϴ�. �����մϴ�.");
		}
		return;
	}

	public void practice2() {
		System.out.println("=========2��° ����=======");
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());

		while (true) {
			if (num > 0) {
				for (int i = 1; i < num + 1; i++) {
					System.out.println(i + " ");
				}
				break;
			} else {
				System.out.print("1�̻��� ���ڸ� �Է����ּ���.");
				num = Integer.parseInt(sc.nextLine());
			}
		}

		return;
	}

	public void practice3() {
		System.out.println("=========3��° ����=======");
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());

		while (true) {
			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.println(i + " ");
				}
				break;
			} else {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
				num = Integer.parseInt(sc.nextLine());
			}
		}

		return;
	}

	public void practice4() {
		System.out.println("=========4��° ����=======");
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());

		while (true) {
			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.println(i + " ");
				}
				break;
			} else {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
				num = Integer.parseInt(sc.nextLine());
			}
		}

		return;
	}

	public void practice5() {
		System.out.println("=========5��° ����=======");
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(true) {
			if(num<1) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = Integer.parseInt(sc.nextLine());
			}else {
				break;
			}
		}
		
		int sum = num;
		for (int i = 1; i < num; i++) {
			System.out.print(i + " + ");
			sum = sum + i;
		}
		System.out.println(num + " = " + (sum));
		return;

	}

	public void practice6() {
		System.out.println("=========6��° ����=======");
		
		System.out.print("ù ��° ���� : ");
		int inNum1 = Integer.parseInt(sc.nextLine());
		System.out.print("�� ��° ���� : ");
		int inNum2 = Integer.parseInt(sc.nextLine());

		while(true) {
			if(inNum1<1||inNum2<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
				
				System.out.print("ù ��° ���� : ");
				inNum1 = Integer.parseInt(sc.nextLine());
				System.out.print("�� ��° ���� : ");
				inNum2 = Integer.parseInt(sc.nextLine());
				
			}else {
				break;
			}
		}
		
		int bigNum;
		int smallNum;
		if (inNum1 < inNum2) {
			bigNum = inNum2;
			smallNum = inNum1;
		} else {
			bigNum = inNum1;
			smallNum = inNum2;
		}
		for (int i = smallNum; i < bigNum+1; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		return;

	}

	public void practice7() {
	System.out.println("=========7��° ����=======");
		
		System.out.print("ù ��° ���� : ");
		int inNum1 = Integer.parseInt(sc.nextLine());
		System.out.print("�� ��° ���� : ");
		int inNum2 = Integer.parseInt(sc.nextLine());

		while(true) {
			if(inNum1<1||inNum2<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
				
				System.out.print("ù ��° ���� : ");
				inNum1 = Integer.parseInt(sc.nextLine());
				System.out.print("�� ��° ���� : ");
				inNum2 = Integer.parseInt(sc.nextLine());
				
			}else {
				break;
			}
		}
		
		int bigNum;
		int smallNum;
		if (inNum1 < inNum2) {
			bigNum = inNum2;
			smallNum = inNum1;
		} else {
			bigNum = inNum1;
			smallNum = inNum2;
		}
		for (int i = smallNum; i < bigNum+1; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		return;

	}

	public void practice8() {
		System.out.println("=========8��° ����=======");
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("===== " + num + "�� ======");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		return;

	}

	public void practice9() {
		System.out.println("=========9��° ����=======");
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		while (true) {
			if (num > 9) {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
				System.out.print("���� : ");
				num = Integer.parseInt(sc.nextLine());
			} else {
				break;
			}
		}

		for (int i = num; i < 10; i++) {
			System.out.println("======" + i + "��======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}

		return;

	}

	public void practice10() {
		System.out.println("=========10��° ����=======");
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		while (true) {
			if (num > 9) {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
				System.out.print("���� : ");
				num = Integer.parseInt(sc.nextLine());
			} else {
				break;
			}
		}

		for (int i = num; i < 10; i++) {
			System.out.println("======" + i + "��======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}

		return;

	}

	public void practice11() {
		System.out.println("=========11��° ����=======");
		System.out.print("���� ���� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int tolerance = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			num1 += tolerance;
		}
		System.out.println();
		return;
	}

	public void practice12() {
		System.out.println("=========12��° ����=======");

		while (true) {

			System.out.print("������(+, -, *, /, %) : ");
			String operator = sc.nextLine();
			
			if (operator.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("���� 1 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("���� 2 : ");
			int num2 = Integer.parseInt(sc.nextLine());

			

			switch (operator) {
			case "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ��Է����ּ���.");
				} else {
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
					break;
				}

			case "%":
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;

			default:
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}

		}
		return;

	}

	public void practice13() {
		System.out.println("=========13��° ����=======");
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;

	}

	public void practice14() {
		System.out.println("=========14��° ����=======");
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;

	}

	public void practice15() {
		System.out.println("=========15��° ����=======");

		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;

		while (true) {
			if (num < 2) {
				System.out.print("�߸��Է��ϼ̽��ϴ�. 2�̻����� �ٽ� �Է����ּ��� : ");

				num = Integer.parseInt(sc.nextLine());

			} else {
				break;
			}

		}

		for (int i = 1; i < num + 1; i++) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		return;

	}

	public void practice16() {
		System.out.println("=========16��° ����=======");

		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;

		while (true) {
			if (num < 2) {
				System.out.print("�߸��Է��ϼ̽��ϴ�. 2�̻����� �ٽ� �Է����ּ��� : ");

				num = Integer.parseInt(sc.nextLine());

			} else {
				break;
			}

		}

		for (int i = 1; i < num + 1; i++) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		return;

	}

	public void practice17() {
		System.out.println("=========17��° ����=======");

		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;
		int primeNumber = 0;

		while (true) {
			if (num < 2) {
				System.out.print("�߸��Է��ϼ̽��ϴ�. 2�̻����� �ٽ� �Է����ּ��� : ");

				num = Integer.parseInt(sc.nextLine());

			} else {
				break;
			}
		}

		for (int i = 2; i < num + 1; i++) {
			count = 0;
			for (int j = 1; j < i + 1; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
				primeNumber++;
			}
		}
		System.out.println("\n2���� " + num + "���� �Ҽ��� ������ " + primeNumber + "���Դϴ�.");
		return;

	}

	public void practice18() {
		System.out.println("=========18��° ����=======");

		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;

		for (int i = 1; i < num + 1; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println("\ncount : " + count);
		return;

	}

	public void practice19() {
		System.out.println("=========19��° ����=======");

		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;

	}

	public void practice20() {
		System.out.println("=========20��° ����=======");

		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < num - 1; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;

	}

	public void practice21() {
		System.out.println("=========21��° ����=======");

		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());
		int star = 1;

		for (int i = 0; i < num; i++) {

			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + star; k++) {
				System.out.print("*");

			}
			star++;
			System.out.println();
		}

		return;

	}

	public void practice22() {
		System.out.println("=========22��° ����=======");

		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println(); // ����
		for (int i = 0; i < num - 2; i++) {

			for (int j = 0; j < num; j++) {
				if (j == 0 || j == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println(); // ����
		}
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}

		return;
	}



	public class WhileDebugExam2 {
		// 2 ~ 100������ ������ �Է¹޾� �� �������� ¦���� ã�� ���α׷�
		// 10
		// 2 4 6 8 10
		
		public static void main(String[] args) {
			
			System.out.println("������ �Է����ּ���.");
			int num = sc.nextInt();
			
			if(num <= 2 || num <= 100) {
				System.out.println("2���� 100������ ���� �ƴմϴ�.");
				return;
			}
			
			for(int i=2; i<=num; i=+1) {  //=+ > +=
				System.out.println(i + " ");
			}
		}
	}


	public class WhileDebugExam {

		
		// ���ڿ��� �޾� ũ�⸦ ����ϴ� ���
		public static void main(String[] args) {
			int i = 0;
			while(i > 10) {
				System.out.println("���ڿ��� �Է����ּ���~");
				String str = sc.nextLine();
				if(str == "exit") { // ! �߰� 
					continue;
				}else {
					System.out.println("���ڿ��� ũ��� " + str.hashCode());
				}
				i++;
			}
			System.out.println("���α׷��� �����մϴ�.");
		}
	}



public class LoopPractice2 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("������ �Է����ּ���.");
		String operator = sc.nextLine();

		System.out.println("���� 1�� �Է����ּ���.");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("���� 2�� �Է����ּ���.");
		num2 = Integer.parseInt(sc.nextLine());

		while(true) {
			if(operator == "exit") {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			switch (operator) {
			case "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ��Է����ּ���.");
				} else {
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
					break;
				}
			case "%":
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;

			default:
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
	}
}

	
}
