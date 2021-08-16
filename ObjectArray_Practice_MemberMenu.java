package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.ObjectArray_Practice_MemberController;

public class ObjectArray_Practice_MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private ObjectArray_Practice_MemberController mc = new ObjectArray_Practice_MemberController();

	public ObjectArray_Practice_MemberMenu() {

	}

	public void mainMenu() {
		while (true) {

			System.out.println("�ִ� ��� ������ ȸ�� ���� " + mc.SIZE + "�� �Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� " + mc.existMemberNum() + "�� �Դϴ�.");

			if (mc.existMemberNum() != mc.SIZE) {
				System.out.println("1. �� ȸ�� ���");
			}

			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");

			System.out.print("�޴� ��ȣ : ");
			int selectMenu = Integer.parseInt(sc.nextLine());

			switch (selectMenu) {

			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;

			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
				continue;
			}

		}

	}

	public void insertMember() {
		String id = "";
		char gender = 0;
		while(true){
		System.out.print("���̵� : ");
		id         =  sc.nextLine();
		if((mc.checkId(id))) {
			System.out.println("�ߺ� �� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			continue;
			}else {
				break;
			}
		
		}
		System.out.print("�̸� : ");
		String name       =  sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password   =  sc.nextLine();
		System.out.print("�̸��� : ");
		String email      =  sc.nextLine();
		while(true) {
		System.out.print("����(M/F) : ");
		gender       =  (sc.nextLine().toUpperCase()).charAt(0);
		if(gender=='M'||gender=='F') {
			break;
		}else {
			System.out.println("�ٽ� �Է����ּ���.");
			continue;
		}
		}
		System.out.print("���� : ");
		int age           =  Integer.parseInt(sc.nextLine());
		
		mc.insertMember(id, name, password, email, gender, age);

	}

	public void searchMember() {
		
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");

		System.out.print("�޴� ��ȣ : ");
		int selectMenu = Integer.parseInt(sc.nextLine());
		
		switch(selectMenu) {
		case 1 :
			searchId();
			break;
		
		case 2 :
			searchName();
			break;
			
		case 3 :
			searchEmail();
			break;
		case 9 :
			System.out.println("�������� ���ư��ϴ�.");
			break;
			
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}

	}

	public void searchId() {
		
		System.out.print("�˻��� ���̵� : ");
		String id = sc.nextLine();
		
		if(mc.searchId(id).equals("")) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(mc.searchId(id));
		}
		

	}

	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		if(mc.searchName(name)==null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			for(int i = 0; i<mc.SIZE;i++) {
				if(mc.searchName(name)[i] == null) {
					break;
				}
			System.out.println(mc.searchName(name)[i].inform());
				
			}
		}

	}

	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.nextLine();
		
		if(mc.searchName(email)==null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			for(int i = 0; i<mc.SIZE;i++) {
				if(mc.searchEmail(email)[i] == null) {
					break;
				}
			System.out.println(mc.searchEmail(email)[i].inform()+"\n");
				
			}
		}

	}

	public void updateMember() {
		System.out.println("1. ��й�ȣ �����ϱ�");
		System.out.println("2. �̸� �����ϱ�");
		System.out.println("3. �̸��� �����ϱ�");
		System.out.println("9. �������� ���ư���");

		System.out.print("�޴� ��ȣ : ");
		int selectMenu = Integer.parseInt(sc.nextLine());
		
		switch(selectMenu) {
		case 1 :
			updatePassword();
			break;
		
		case 2 :
			updateName();
			break;
			
		case 3 :
			updateEmail();
			break;
		case 9 :
			System.out.println("�������� ���ư��ϴ�.");
			break;
			
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}

	public void updatePassword() {
		System.out.print("������ ȸ�� ���̵� : ");
		String id = sc.nextLine();

		System.out.print("������ �н����� : ");
		String pass = sc.nextLine();
		
		mc.updatePassword(id, pass);
		
		if(mc.updatePassword(id, pass)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
		
		
	}

	public void updateName() {
		
		System.out.print("������ ȸ�� ���̵� : ");
		String id = sc.nextLine();

		System.out.print("������ �̸� : ");
		String name = sc.nextLine();
		
		mc.updateName(id, name);
		
		if(mc.updateName(id, name)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}

	}

	public void updateEmail() {
		
		System.out.print("������ ȸ�� ���̵� : ");
		String id = sc.nextLine();

		System.out.print("������ �̸��� : ");
		String email = sc.nextLine();
		
		mc.updateEmail(id, email);
		
		if(mc.updateEmail(id, email)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}


	}

	public void deleteMember() {
		
		System.out.println("1. Ư�� ȸ�� �����ϱ�");
		System.out.println("2. ��� ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");

		System.out.print("�޴� ��ȣ : ");
		int selectMenu = Integer.parseInt(sc.nextLine());
		
		switch(selectMenu) {
		
		case 1 : 
			deleteOne();
			break;
		case 2 :
			deleteAll();
			break;
		case 9 : 
			System.out.println("���θ޴��� ���ư��ϴ�.");
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
			
		}
		
		

	}

	public void deleteOne() {
		
		System.out.print("������ ȸ�� ���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("������ �����Ͻðڽ��ϱ�? : ");
		char deleteSelect       =  (sc.nextLine().toUpperCase()).charAt(0);
		if(deleteSelect=='Y') {
			if(mc.delete(id)) {
				System.out.println("���������� �����Ͽ����ϴ�.");
			}else {
				System.out.println("���������ʴ� ���̵��Դϴ�.");
			}
		}else if(deleteSelect=='N') {
			System.out.println("������ ����߽��ϴ�. �������� ���ư��ϴ�.");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �������� ���ư��ϴ�.");
		}

	}

	public void deleteAll() {
		
		System.out.print("������ �����Ͻðڽ��ϱ�? : ");
		char deleteSelect       =  (sc.nextLine().toUpperCase()).charAt(0);
		if(deleteSelect=='Y') {
			mc.delete();
				System.out.println("���������� �����Ͽ����ϴ�.");
			

		}else if(deleteSelect=='N') {
			System.out.println("������ ����߽��ϴ�. �������� ���ư��ϴ�.");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �������� ���ư��ϴ�.");
		}

	}

	public void printAll() {
		
		if(mc.existMemberNum()==0) {
			System.out.println("���� �� ȸ���� �����ϴ�.");
		}else {
			for(int i = 0; i<mc.SIZE;i++) {
				if(mc.printAll()[i]==null) {
					break;
				}else {
					System.out.println(mc.printAll()[i].inform()+"\n");
				}
				
			}
		}

	}

}
