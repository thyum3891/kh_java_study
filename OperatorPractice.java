package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	static Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("==========�ǽ����� 1 ��=========");
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num < 1)
			System.out.println("����� �ƴϴ�.");
		else
			System.out.println("�����");


	}

	public void practice2() {
		

		System.out.println("==========�ǽ����� 2 ��=========");
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num < 0)
			System.out.println("������.");
		else if (num == 0)
			System.out.println("0�̴�.");
		else
			System.out.println("�����");

	}

	public void practice3() {

		System.out.println("==========�ǽ����� 3 ��=========");
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num % 2 == 1)
			System.out.println("Ȧ����");
		else
			System.out.println("¦����");

	}

	public void practice4() {

		System.out.println("==========�ǽ����� 4 ��=========");
		System.out.print("�ο� �� : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� : ");
		int num2 = Integer.parseInt(sc.nextLine());

		System.out.println("1�δ� ���� ���� : " + num2 / num);
		System.out.println("���� ���� ���� : " + num2 % num);

	}

	public void practice5() {

		System.out.println("==========�ǽ����� 5 ��=========");

		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� (���ڸ�) : ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("�� (���ڸ�) : ");
		int cla = Integer.parseInt(sc.nextLine());
		System.out.print("��ȣ (���ڸ�) : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("����(M/F) : ");
		char gen = sc.nextLine().charAt(0);
		System.out.println("���� (�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = Double.parseDouble(sc.nextLine());

		String gender;

		if (gen == ('F') || gen == ('f'))
			gender = "���л�";
		else
			gender = "���л�";

		System.out.println(grade + "�г� " + cla + "�� " + num + "�� " + name + " " + gender + "�� ������ " + score + " �̴�.");

	}

	public void practice6() {

		System.out.println("==========�ǽ����� 6 ��=========");

		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());

		if (age <= 13)
			System.out.println("���");
		if (age > 13 && age <= 19)
			System.out.println("û�ҳ�");
		if (age > 19)
			System.out.println("����");

	}

	public void practice7() {

		System.out.println("==========�ǽ����� 7 ��=========");

		System.out.print("���� : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int math = Integer.parseInt(sc.nextLine());

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60)
			;

	}

	public void practice8() {

		System.out.println("==========�ǽ����� 8 ��=========");

		System.out.print("�ֹι�ȣ�� �Է����ּ��� (- ����) : ");
		String num = sc.nextLine();

		char gen = num.charAt(7);

		if (gen == '2')
			System.out.println("����");
		else
			System.out.println("����");


	}

	public void practice9() {

		System.out.println("==========�ǽ����� 9 ��=========");
		System.out.print("����1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("����2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("�Է� : ");
		int num3 = Integer.parseInt(sc.nextLine());

		boolean boo = num1 >= num3 || num2 < num3;

		System.out.println(boo);

	}

	public void practice10() {

		System.out.println("==========�ǽ����� 10 ��=========");
		System.out.print("�Է�1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("�Է�2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("�Է�3 : ");
		int num3 = Integer.parseInt(sc.nextLine());

		boolean boo = num1 == num3 && num2 == num3;

		System.out.println(boo);

	}

	public void practice11() {

		System.out.println("==========�ǽ����� 11 ��=========");

		System.out.print("A ����� ���� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("B ����� ���� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("C ����� ���� : ");
		int num3 = Integer.parseInt(sc.nextLine());

		double a = num1 * 1.4;

		System.out.println("A ����� ���� / ���� + a : " + num1 + "/" + a);
		extracted(a);
		a = num2;
		System.out.println("B ����� ���� / ���� + a : " + num2 + "/" + a);
		extracted(a);
		a = num3 * 1.15;
		System.out.println("C ����� ���� / ���� + a : " + num3 + "/" + a);
		extracted(a);

	}

	private void extracted(double a) {
		if (a >= 3000)
			System.out.println("3000 �̻�");
		else
			System.out.println("3000�̸�");

	}

}
