package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	static String name;
	static char gender;
	static int age;
	static double height;
	
	static Scanner sc = new Scanner(System.in);
	
	public  void run() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		gender = sc.next().charAt(0);
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();
		
		System.out.println("Ű " + height + "cm�� " + age + "�� " +gender + "�� " + name + "�� �ݰ����ϴ� ^^");
		
	}
	

}
