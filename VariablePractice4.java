package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	static Scanner sc = new Scanner(System.in);
	
	public void run() {
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
	}
	
}
