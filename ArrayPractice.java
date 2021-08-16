package com.kh.practice.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

	static Scanner sc = new Scanner(System.in);

	public void practice1() {

		int[] numArr = new int[10];

		for (int i = 0; i < 10; i++) {

			numArr[i] = i + 1;

			System.out.print(numArr[i] + " ");

		}

		System.out.println();
		return;
	}

	public void practice2() {

		int[] numArr = new int[10];
		int j = numArr.length;

		for (int i = 0; i < 10; i++) {
			numArr[i] = j--;
			System.out.print(numArr[i] + " ");
		}

		System.out.println();
		return;
	}

	public void practice3() {

		System.out.println("���� ����");
		int[] numArr = new int[Integer.parseInt(sc.nextLine())];

		for (int i = 0; i < numArr.length; i++) {

			numArr[i] = i + 1;

			System.out.print(numArr[i] + " ");

		}

		System.out.println();
		return;
	}

	public void practice4() {
		String[] fruit = new String[] { "���", "��", "����", "������", "����" };

		System.out.println(fruit[1]);
		return;

	}

	public void practice5() {
		System.out.print("���ڿ� : ");
		String strInput = sc.nextLine();
		System.out.print("���� : ");
		char chInput = (char) sc.nextLine().charAt(0);
		char[] chArr = new char[strInput.length()];
		int count = 0;

		System.out.print(strInput + "�� " + chInput + "�� �����ϴ� ��ġ(�ε���) : ");

		for (int i = 0; i < 10; i++) {
			chArr[i] = strInput.charAt(i);
			if (chArr[i] == chInput) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + chInput + " ���� : " + count);
		return;

	}

	public void practice6() {

		String[] weekArr = new String[] { "������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���" };
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num > 0 && num < 7) {
			System.out.println(weekArr[num]);
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		return;

	}

	public void practice7() {
		System.out.print("���� : ");
		int[] numArr = new int[Integer.parseInt(sc.nextLine())];
		int sum = 0;

		for (int i = 0; i < numArr.length; i++) {
			System.out.print("\n�迭 " + i + "��° �ε����� ���� �� : ");
			numArr[i] = Integer.parseInt(sc.nextLine());
			sum = sum + numArr[i];
		}

		System.out.print("�� �� : " + sum + "\n");
		return;

	}

	public void practice8() {

		int num;
		while (true) {

			System.out.print("���� : ");
			num = Integer.parseInt(sc.nextLine());

			if (num % 2 == 1 && num > 2) {
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}

		int[] numArr = new int[num];
		int num2 = numArr.length / 2;

		for (int i = 0; i < num2; i++) {
			numArr[i] = i + 1;
			System.out.print(numArr[i] + " ");
		}
		for (int i = num2; i < numArr.length; i++) {
			numArr[i] = num2 + 1;
			num2--;
			System.out.print(numArr[i] + " ");
		}

		System.out.println();
		return;
	}

	public void practice9() {
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.nextLine();
		String[] chickenArr = new String[] { "���", "�Ķ��̵�", "�����̳�", "�Ѹ�Ŭ" };
		boolean flag = false;

		for (int i = 0; i < chickenArr.length; i++) {

			if (chickenArr[i].contains(chicken)) {
				System.out.println(chicken + "ġŲ ��� ����");
				flag = true;
				break;
			
				
				
			}
			
			if(flag==false) {
				System.out.println(chicken + "ġŲ�� ���� �޴��Դϴ�.");
				
			}

		}

		return;

	}

	public void practice10() {
		System.out.print("�ֹε�Ϲ�ȣ(- ����) : ");
		String user = sc.nextLine();
		String[] userNum = new String[14];
		for (int i = 0; i < userNum.length; i++) {
			if (i > 7) {
				userNum[i] = "*";
			} else {
				userNum[i] = "" + (user.charAt(i));
			}
			System.out.print(userNum[i]);
		}
		System.out.println();
		return;

	}

	public void practice11() {
		int[] numArr = new int[10];
		Random ran = new Random();

		for (int i = 0; i < 10; i++) {
			numArr[i] = ran.nextInt(10);
			System.out.print(numArr[i] + " ");
		}

	}

	public void practice12() {
		int[] numArr = new int[10];
		Random ran = new Random();
		int min = 10;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			numArr[i] = ran.nextInt(10);
			if (max < numArr[i]) {
				numArr[i] = max;
			} else if (min > numArr[i]) {
				numArr[i] = min;
			}

		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		return;
	}

	public void practice13() {
		int[] numArr = new int[10];
		Random ran = new Random();

		for (int i = 0; i < 10; i++) {
			numArr[i] = ran.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (numArr[i] == numArr[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}

		System.out.println();
		return;
	}

	public void practice14() {
		int[] numArr = new int[6];
		Random ran = new Random();

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numArr[i] == numArr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(numArr);
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}

		System.out.println();
		return;
	}

	public void practice15() {

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		String[] strArr = new String[str.length()];
		int count;
		int countSum = 0;
		System.out.print("���ڿ��� �ִ� ���� : ");
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			strArr[i] = "" + str.charAt(i);

			for (int j = 0; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(strArr[i]);
				countSum++;
				if (i != (str.length() - 1)) {
					System.out.print(", ");
				}
			}
		}
		System.out.println("\n���� ���� : " + countSum);
	}

	public void practice16() {

		int num = 0;
		int num2 = 0;
		String[] strArr2 = new String[100];
		boolean n;

		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		while (true) {
			n = false;
			num = num + Integer.parseInt(sc.nextLine());
			String[] strArr = new String[num];

			for (int i = num2; i < strArr.length; i++) {
				System.out.print(i + "��° ���ڿ� : ");
				strArr2[i] = sc.nextLine();
			}

			num2 = num;

			while (true) {

				System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N)");
				String yORn = ("" + sc.nextLine().charAt(0)).toUpperCase();
				if (yORn.contains("N")) {
					for (int i = 0; i < strArr.length; i++) {
						if (strArr2[i] != null)
							strArr[i] = strArr2[i];
					}
					System.out.println(Arrays.toString(strArr));
					n = true;
					break;
				} else if (yORn.contains("Y")) {
					System.out.print("�� �Է��ϰ� ���� ���� : ");
					break;
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
				}
			}

			if (n == true) {
				break;
			}
		}

	}
	public void practice17(){
		int cnt = 0;
		int inputVal = 0;
		String[] strArray = null;

		System.out.println("�迭�� ũ�⸦ �Է��ϼ���.");
		inputVal = Integer.parseInt(sc.nextLine());
		strArray = new String[inputVal];

		while(true) { 
			System.out.println((cnt+1) + "��° ���ڿ� �Է¹ٶ�");
			String temp = sc.nextLine();
			strArray[cnt++] = temp;

			if(cnt == strArray.length) {
				System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N)");
				String result = sc.nextLine();
				if(result.toUpperCase().contains("Y") == true) {
					System.out.println("�� �Է��ϰ� ���� ����");
					int inputInt = Integer.parseInt(sc.nextLine());
					String[] tempStrArray = new String[inputInt + strArray.length];
					for(int j = 0; j < strArray.length; j++) {
						tempStrArray[j] = strArray[j]; // ���������Ͽ� 2���迭�� ���� �Է�
					}
					strArray = tempStrArray; // ���������Ͽ� 2���迭���� ��� �Է�
					continue;
				}else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(strArray));
	}
	
}