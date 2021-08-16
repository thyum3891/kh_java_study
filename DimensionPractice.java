package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class DimensionPractice {
	static Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[][] numArr = new int[3][3];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i][0] = i;
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[0][j] = j;
				System.out.print("(" + numArr[i][0] + ", " + numArr[0][j] + ")");
			}
			System.out.println();

		}
	}

	public void practice2() {
		int[][] numArr = new int[4][4];
		int num = 1;
		for (int i = 0; i < numArr.length; i++) {

			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = num;
				num++;
				System.out.print(numArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void practice3() {
		int[][] numArr = new int[4][4];
		int num = numArr.length * numArr[0].length;
		for (int i = 0; i < numArr.length; i++) {

			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = num;
				num--;
				System.out.print(numArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void practice4() {
		int[][] numArr = new int[4][4];
		int sumX = 0;
		int sumY = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				if (i == numArr[i].length - 1) {
					for (int k = 0; k < numArr[j].length; k++) {
						sumY = sumY + numArr[k][j];
					}
					numArr[i][j] = sumY;
					System.out.print(numArr[i][j] + "\t");
					sumY = 0;
				} else {
					if (j != numArr[i].length - 1) {
						numArr[i][j] = (new Random().nextInt(10)) + 1;
						sumX = sumX + numArr[i][j];
						System.out.print(numArr[i][j] + "\t");
					} else {
						numArr[i][j] = sumX;
						sumX = 0;
						System.out.print(numArr[i][j] + "\t");
					}
				}
			}
			System.out.println();
		}
	}

	public void practice5() {
		System.out.print("행 크기 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("열 크기 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		char[][] chArr = new char[num1][num2];

		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < chArr[i].length; j++) {
				chArr[i][j] = (char) (new Random().nextInt(25) + 65);

				System.out.print(chArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void practice6() {

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {

				System.out.print(strArr[j][i] + "\t");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		System.out.print("행의 크기 : ");
		int num = Integer.parseInt(sc.nextLine());
		char[][] chArr = new char[num][];
		int chUP=0;
		char ch = (char)(97+chUP);
		
		for(int i=0;i<num;i++) {
			System.out.print(i+"행의 열 크기 : ");
			chArr[i] = new char[Integer.parseInt(sc.nextLine())];
		}
		
		for(int i = 0; i < chArr.length;i++) {
			for(int j = 0; j < chArr[i].length;j++) {
				chArr[i][j] = ch++;
//				chUP++;
				System.out.print(chArr[i][j] + "\t");
			}
			System.out.println();
		}

}
	public void practice8() {
		String[] student = {"류라라","강건강", "남나나", "도대담",  "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] section1=new String [3][2];
		String[][] section2=new String [3][2];
		String leftRight;
		int section;
		String sequence;
		int count = 0;
		
		Arrays.sort(student);
		System.out.println(Arrays.toString(student));
		
		
		System.out.println("=====1분단=====");
		for(int i = 0; i<section1.length;i++) {
			for(int j = 0; j<section1[i].length;j++) {
				section1[i][j] = student[count];
				count++;
				System.out.print(section1[i][j]+" ");
			}			
			System.out.println();
		}
		System.out.println("=====2분단=====");
		for(int i = 0; i<section2.length;i++) {
			for(int j = 0; j<section2[i].length;j++) {
				section2[i][j] = student[count];
				count++;
				System.out.print(section2[i][j]+" ");
			}			
			System.out.println();
		}
		System.out.println("=====================");
		System.out.print("검색할 학생 이름을 입력하세요. : ");
		String search = sc.nextLine();
		int searchNum = Arrays.binarySearch(student, search);
		
		
		if(searchNum<student.length/2) {
		section = 1;
		}else {
		section = 2;
		}
		
		if((searchNum+1)%2==0) {
			leftRight = "오른쪽";
		}else {
			leftRight = "왼쪽";
		}
		if(searchNum<7){
		if(searchNum<2||((searchNum+1)/2)==1) {
			sequence = "첫 번째 ";
		}else if((searchNum+1)/2==2) {
			sequence = "두 번째 ";
		}else{
			sequence = "세 번째 ";
		}
	}else {
		searchNum = searchNum/2;
		if(searchNum<2||((searchNum+1)/2)==1) {
			sequence = "첫 번째 ";
		}else if((searchNum+1)/2==2) {
			sequence = "두 번째 ";
		}else{
			sequence = "세 번째 ";
		}
		}
		
		System.out.println("검색하신 "+search+" 학생은 "+section+"분단 "+sequence+leftRight+"에 있습니다.");
		
		
		
	
	}
	}

	
	
