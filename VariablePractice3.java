package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	static Scanner sc = new Scanner(System.in);

	public void run() {
	
	System.out.print("���� : ");
	double num1 = sc.nextDouble();
	System.out.print("���� : ");
	double num2 = sc.nextDouble();
	
	System.out.println("���� : " + num1 * num2);
	System.out.println("�ѷ� : " + (num1 + num2)*2);
	
	}
}
