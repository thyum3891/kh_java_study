package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	static Scanner sc = new Scanner(System.in);
	
	public void run() {
		
		System.out.print("문자 : ");
		char ch1 = sc.next().charAt(0);
		System.out.println(ch1 + " unicode : " + (int)(ch1)+ "\n");
		
		System.out.print("문자 : ");
		char ch2 = sc.next().charAt(0);
		System.out.println(ch2 + " unicode : " + (int)(ch2)+ "\n");
		
		
	}
}
