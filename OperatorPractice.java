package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	static Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("==========실습문제 1 번=========");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num < 1)
			System.out.println("양수가 아니다.");
		else
			System.out.println("양수다");


	}

	public void practice2() {
		

		System.out.println("==========실습문제 2 번=========");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num < 0)
			System.out.println("음수다.");
		else if (num == 0)
			System.out.println("0이다.");
		else
			System.out.println("양수다");

	}

	public void practice3() {

		System.out.println("==========실습문제 3 번=========");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num % 2 == 1)
			System.out.println("홀수다");
		else
			System.out.println("짝수다");

	}

	public void practice4() {

		System.out.println("==========실습문제 4 번=========");
		System.out.print("인원 수 : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("사탕 개수 : ");
		int num2 = Integer.parseInt(sc.nextLine());

		System.out.println("1인당 사탕 개수 : " + num2 / num);
		System.out.println("남는 사탕 개수 : " + num2 % num);

	}

	public void practice5() {

		System.out.println("==========실습문제 5 번=========");

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 (숫자만) : ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("반 (숫자만) : ");
		int cla = Integer.parseInt(sc.nextLine());
		System.out.print("번호 (숫자만) : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("성별(M/F) : ");
		char gen = sc.nextLine().charAt(0);
		System.out.println("성적 (소수점 아래 둘째자리까지) : ");
		double score = Double.parseDouble(sc.nextLine());

		String gender;

		if (gen == ('F') || gen == ('f'))
			gender = "여학생";
		else
			gender = "남학생";

		System.out.println(grade + "학년 " + cla + "반 " + num + "번 " + name + " " + gender + "의 성적은 " + score + " 이다.");

	}

	public void practice6() {

		System.out.println("==========실습문제 6 번=========");

		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());

		if (age <= 13)
			System.out.println("어린이");
		if (age > 13 && age <= 19)
			System.out.println("청소년");
		if (age > 19)
			System.out.println("성인");

	}

	public void practice7() {

		System.out.println("==========실습문제 7 번=========");

		System.out.print("국어 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(sc.nextLine());

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60)
			;

	}

	public void practice8() {

		System.out.println("==========실습문제 8 번=========");

		System.out.print("주민번호를 입력해주세요 (- 포함) : ");
		String num = sc.nextLine();

		char gen = num.charAt(7);

		if (gen == '2')
			System.out.println("여자");
		else
			System.out.println("남자");


	}

	public void practice9() {

		System.out.println("==========실습문제 9 번=========");
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("입력 : ");
		int num3 = Integer.parseInt(sc.nextLine());

		boolean boo = num1 >= num3 || num2 < num3;

		System.out.println(boo);

	}

	public void practice10() {

		System.out.println("==========실습문제 10 번=========");
		System.out.print("입력1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("입력2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("입력3 : ");
		int num3 = Integer.parseInt(sc.nextLine());

		boolean boo = num1 == num3 && num2 == num3;

		System.out.println(boo);

	}

	public void practice11() {

		System.out.println("==========실습문제 11 번=========");

		System.out.print("A 사원의 연봉 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("B 사원의 연봉 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("C 사원의 연봉 : ");
		int num3 = Integer.parseInt(sc.nextLine());

		double a = num1 * 1.4;

		System.out.println("A 사원의 연봉 / 연봉 + a : " + num1 + "/" + a);
		extracted(a);
		a = num2;
		System.out.println("B 사원의 연봉 / 연봉 + a : " + num2 + "/" + a);
		extracted(a);
		a = num3 * 1.15;
		System.out.println("C 사원의 연봉 / 연봉 + a : " + num3 + "/" + a);
		extracted(a);

	}

	private void extracted(double a) {
		if (a >= 3000)
			System.out.println("3000 이상");
		else
			System.out.println("3000미만");

	}

}
