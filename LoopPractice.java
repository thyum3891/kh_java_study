package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	static Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("=========1번째 과제=======");
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num > 0) {
			for (int i = 1; i < num + 1; i++) {
				System.out.println(i + " ");
			}
		} else {
			System.out.println("입력하신 값이 1보다 작습니다. 종료합니다.");
		}
		return;
	}

	public void practice2() {
		System.out.println("=========2번째 과제=======");
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());

		while (true) {
			if (num > 0) {
				for (int i = 1; i < num + 1; i++) {
					System.out.println(i + " ");
				}
				break;
			} else {
				System.out.print("1이상의 숫자를 입력해주세요.");
				num = Integer.parseInt(sc.nextLine());
			}
		}

		return;
	}

	public void practice3() {
		System.out.println("=========3번째 과제=======");
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());

		while (true) {
			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.println(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
				num = Integer.parseInt(sc.nextLine());
			}
		}

		return;
	}

	public void practice4() {
		System.out.println("=========4번째 과제=======");
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());

		while (true) {
			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.println(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
				num = Integer.parseInt(sc.nextLine());
			}
		}

		return;
	}

	public void practice5() {
		System.out.println("=========5번째 과제=======");
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(true) {
			if(num<1) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
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
		System.out.println("=========6번째 과제=======");
		
		System.out.print("첫 번째 숫자 : ");
		int inNum1 = Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 숫자 : ");
		int inNum2 = Integer.parseInt(sc.nextLine());

		while(true) {
			if(inNum1<1||inNum2<1) {
				System.out.println("1이상의 숫자를 입력해주세요");
				
				System.out.print("첫 번째 숫자 : ");
				inNum1 = Integer.parseInt(sc.nextLine());
				System.out.print("두 번째 숫자 : ");
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
	System.out.println("=========7번째 과제=======");
		
		System.out.print("첫 번째 숫자 : ");
		int inNum1 = Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 숫자 : ");
		int inNum2 = Integer.parseInt(sc.nextLine());

		while(true) {
			if(inNum1<1||inNum2<1) {
				System.out.println("1이상의 숫자를 입력해주세요");
				
				System.out.print("첫 번째 숫자 : ");
				inNum1 = Integer.parseInt(sc.nextLine());
				System.out.print("두 번째 숫자 : ");
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
		System.out.println("=========8번째 과제=======");
		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("===== " + num + "단 ======");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		return;

	}

	public void practice9() {
		System.out.println("=========9번째 과제=======");
		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		while (true) {
			if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				System.out.print("숫자 : ");
				num = Integer.parseInt(sc.nextLine());
			} else {
				break;
			}
		}

		for (int i = num; i < 10; i++) {
			System.out.println("======" + i + "단======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}

		return;

	}

	public void practice10() {
		System.out.println("=========10번째 과제=======");
		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		while (true) {
			if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				System.out.print("숫자 : ");
				num = Integer.parseInt(sc.nextLine());
			} else {
				break;
			}
		}

		for (int i = num; i < 10; i++) {
			System.out.println("======" + i + "단======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}

		return;

	}

	public void practice11() {
		System.out.println("=========11번째 과제=======");
		System.out.print("시작 숫자 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("공차 : ");
		int tolerance = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			num1 += tolerance;
		}
		System.out.println();
		return;
	}

	public void practice12() {
		System.out.println("=========12번째 과제=======");

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String operator = sc.nextLine();
			
			if (operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수 1 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("정수 2 : ");
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
					System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요.");
				} else {
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
					break;
				}

			case "%":
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;

			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			}

		}
		return;

	}

	public void practice13() {
		System.out.println("=========13번째 과제=======");
		System.out.print("정수 입력 : ");
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
		System.out.println("=========14번째 과제=======");
		System.out.print("정수 입력 : ");
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
		System.out.println("=========15번째 과제=======");

		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;

		while (true) {
			if (num < 2) {
				System.out.print("잘못입력하셨습니다. 2이상으로 다시 입력해주세요 : ");

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
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		return;

	}

	public void practice16() {
		System.out.println("=========16번째 과제=======");

		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;

		while (true) {
			if (num < 2) {
				System.out.print("잘못입력하셨습니다. 2이상으로 다시 입력해주세요 : ");

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
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		return;

	}

	public void practice17() {
		System.out.println("=========17번째 과제=======");

		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		int count = 0;
		int primeNumber = 0;

		while (true) {
			if (num < 2) {
				System.out.print("잘못입력하셨습니다. 2이상으로 다시 입력해주세요 : ");

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
		System.out.println("\n2부터 " + num + "까지 소수의 개수는 " + primeNumber + "개입니다.");
		return;

	}

	public void practice18() {
		System.out.println("=========18번째 과제=======");

		System.out.print("숫자 : ");
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
		System.out.println("=========19번째 과제=======");

		System.out.print("정수 입력 : ");
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
		System.out.println("=========20번째 과제=======");

		System.out.print("정수 입력 : ");
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
		System.out.println("=========21번째 과제=======");

		System.out.print("정수 입력 : ");
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
		System.out.println("=========22번째 과제=======");

		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println(); // 개행
		for (int i = 0; i < num - 2; i++) {

			for (int j = 0; j < num; j++) {
				if (j == 0 || j == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println(); // 개행
		}
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}

		return;
	}



	public class WhileDebugExam2 {
		// 2 ~ 100까지의 정수를 입력받아 그 수까지의 짝수를 찾는 프로그램
		// 10
		// 2 4 6 8 10
		
		public static void main(String[] args) {
			
			System.out.println("정수를 입력해주세요.");
			int num = sc.nextInt();
			
			if(num <= 2 || num <= 100) {
				System.out.println("2부터 100까지의 수가 아닙니다.");
				return;
			}
			
			for(int i=2; i<=num; i=+1) {  //=+ > +=
				System.out.println(i + " ");
			}
		}
	}


	public class WhileDebugExam {

		
		// 문자열을 받아 크기를 출력하는 기능
		public static void main(String[] args) {
			int i = 0;
			while(i > 10) {
				System.out.println("문자열을 입력해주세요~");
				String str = sc.nextLine();
				if(str == "exit") { // ! 추가 
					continue;
				}else {
					System.out.println("문자열의 크기는 " + str.hashCode());
				}
				i++;
			}
			System.out.println("프로그램을 종료합니다.");
		}
	}



public class LoopPractice2 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("연산자 입력해주세요.");
		String operator = sc.nextLine();

		System.out.println("숫자 1을 입력해주세요.");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("숫자 2을 입력해주세요.");
		num2 = Integer.parseInt(sc.nextLine());

		while(true) {
			if(operator == "exit") {
				System.out.println("프로그램을 종료합니다");
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
					System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요.");
				} else {
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
					break;
				}
			case "%":
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;

			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}

	
}
