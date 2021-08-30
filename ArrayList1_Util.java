package com.kh.practice.list.util;

import java.util.Scanner;

public class ArrayList1_Util {

	static private Scanner sc = new Scanner(System.in);

	public int inputScanInt() {

		int i = 0;
		sc.reset();

		while (true) {

			String str = sc.nextLine();
			if (str == null || str.length() < 1) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}

			try {

				i = Integer.parseInt(str);

			} catch (Exception e) {

				System.out.println("�ٽ� �Է����ּ���.");

				continue;

			}

			break;
		}
		return i;
	}

	public String inputScanStr() {

		String str = "";
		sc.reset();
		while (true) {

			try {

				str = sc.nextLine();

			} catch (Exception e) {

				System.out.println("�ٽ� �Է����ּ���.");

				continue;

			}

			if (str.equals("") || str == null) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}

			break;
		}
		return str;
	}

	public char inputScanChar() {

		char ch;
		sc.reset();
		while (true) {

			String str = sc.nextLine();
			if (str == null || str.length() < 1) {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}

			if ((str.length() == 1) == false) {
				System.out.println("�ѱ��ڸ� �Է����ּ���.");
				continue;
			}

			try {

				ch = str.charAt(0);

			} catch (Exception e) {

				System.out.println("�ٽ� �Է����ּ���.");

				continue;

			}

			break;
		}

		return ch;

	}

}
