package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice3 {
	static Scanner sc = new Scanner(System.in);
	
	public void run() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println((int)dNum);
		System.out.println(iNum1/iNum2);
		
		System.out.println((double)iNum1);
		System.out.println((double)(dNum*iNum2));
		
		System.out.println((double)(iNum1)/iNum2);
		System.out.println((double)iNum1/(int)dNum/(int)dNum);
		
		System.out.println((float)iNum1/fNum);
		System.out.println((double)iNum1/fNum);
		
		System.out.println((char)(iNum1*dNum + iNum1*iNum2));
		System.out.println((int)(ch));
		System.out.println((int)(ch+iNum1));
		System.out.println((char)(ch+iNum1));
		
	}
		
}
