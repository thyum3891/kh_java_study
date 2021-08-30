package com.kh.practice.map.view;

import com.kh.practice.map.controller.Map_MemberController;
import com.kh.practice.map.model.vo.Map_Member;
import com.kh.practice.map.util.Map_Util;

public class Map_MemberMenu {

	private Map_MemberController mc = new Map_MemberController();
	private Map_Util util = new Map_Util();

	public void mainMenu() {
		while (true) {
			System.out.println("========== KH  ����Ʈ  ==========");

			System.out.println("*******  ����  �޴�  *******");
			System.out.println("1.  ȸ������"); // joinMembership() ����
			System.out.println("2.  �α���"); // logIn() ���� �� memberMenu() ����
			System.out.println("3.  ����  �̸�  ȸ��  ã��"); // sameName()
			System.out.println("9.  ����"); // �����α׷� ����.�� ��� �� main()���� ����
			System.out.print("�޴�  ��ȣ  ����  : "); // >> �Է� ����
			int selectNum = util.inputScanInt();

			switch (selectNum) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;

			default:
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}

		}

	}

	public void memberMenu() {
		while (true) {
			System.out.println("*******  ȸ��  �޴�  *******");
			System.out.println("1.  ��й�ȣ �ٲٱ�");
			System.out.println("2.  �̸� �ٲٱ�");
			System.out.println("3.  �α׾ƿ�");

			System.out.print("�޴�  ��ȣ  ����  : ");
			int selectNum = util.inputScanInt();

			switch (selectNum) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				mainMenu();
				break;

			default:
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}

		}

	}

	public void joinMembership() {

		System.out.print("ID : ");
		String id = util.inputScanStr();

		System.out.print("PW : ");
		String pw = util.inputScanStr();

		System.out.print("Name : ");
		String name = util.inputScanStr();

		Map_Member mem = new Map_Member(pw, name);

		if (mc.joinMembership(id, mem) == true) {

			System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");

		} else {

			System.out.println("�ߺ� �� ���̵��Դϴ�.");

		}

	}

	public void logIn() {
		while (true) {
			System.out.print("ID : ");
			String id = util.inputScanStr();

			System.out.print("PW : ");
			String pw = util.inputScanStr();

			String userName = mc.logIn(id, pw);

			if (userName != null) {

				System.out.println(userName + "��, ȯ���մϴ�.");
				memberMenu();
			} else {

				System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ��Է����ּ���.");
				continue;
			}

		}
	}

	public void changePassword() {
		while(true) {
		System.out.print("ID : ");
		String id = util.inputScanStr();

		System.out.print("PW : ");
		String pw = util.inputScanStr();
		
		System.out.print("�����Ͻ� PW : ");
		String newPw = util.inputScanStr();
		
		if(mc.changePassword(id, pw, newPw)==true) {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
			break;
		}else {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
			
			continue;
		
		}
		
		}
		

	}

	public void changeName() {

		String id;
		String pw;
		String newName;

		while (true) {
			System.out.print("ID : ");
			id = util.inputScanStr();

			System.out.print("PW : ");
			pw = util.inputScanStr();

			String userName = mc.logIn(id, pw);

			if (userName != null) {

				System.out.println(userName + "��, ȯ���մϴ�.");

				System.out.print("�����Ͻ� �̸� : ");
				newName = util.inputScanStr();

				mc.changeName(id, newName);
				System.out.println("�̸� ���濡 �����Ͽ����ϴ�.");
				break;

			} else {

				System.out.println("�̸����濡 �����Ͽ����ϴ�. �ٽ��Է����ּ���.");
				continue;
			}

		}

	}

	public void sameName() {
		
		System.out.print("�˻��� �̸� : ");
		String name = util.inputScanStr();
		
		System.out.println(mc.sameName(name).entrySet());

	}

}
