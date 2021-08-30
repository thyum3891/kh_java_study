package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;

import com.kh.practice.set.controller.Set_LotteryController;
import com.kh.practice.set.model.vo.Set_Lottery;
import com.kh.practice.set.util.Set_Util;

public class Set_LotteryMenu {

	private Set_LotteryController lc = new Set_LotteryController();
	private Set_Util util = new Set_Util();

	public void mainMenu() {
		while (true) {
			
			System.out.println("========== KH  ��÷  ���α׷�  ==========");
			StringBuffer sb = new StringBuffer();
			sb.append("*******  ����  �޴�  *******\n");
			sb.append("1.  ��÷  ���  �߰�\n");
			sb.append("2.  ��÷  ���  ����\n");
			sb.append("3.  ��÷  ���  Ȯ��\n");
			sb.append("4.  ���ĵ�  ��÷  ���  Ȯ��\n");
			sb.append("5.  ��÷  ���  �˻�\n");
			sb.append("9.  ����\n");
			sb.append("�޴�  ��ȣ  ���� : ");
			System.out.print(sb);
			int selectNum = util.inputScanInt();

			switch (selectNum) {
			case 1:
				insertObject();
				break;
				
			case 2:
				deleteObject();
				break;
				
			case 3:
				winObject();
				break;
				
			case 4:
				sortedWinObject();
				break;
				
			case 5:
				searchWinner();
				break;
				
			case 9:
				System.out.println("���α׷� ����");
				return;
				
			default:
				System.out.println("�ٽ� �Է����ּ���.");
				continue;

			}

		}

	}

	public void insertObject() {

		System.out.print("�߰��� ��÷ ��� �� : ");
		int add = util.inputScanInt();
		Set_Lottery[] addLottery = new Set_Lottery[add];
		for (int i = 0; i < add; i++) {
			System.out.print(i+"��°, �߰� ��� �̸� : ");
			String name = util.inputScanStr();
			System.out.print(i+"��°, �߰� ��� ��ȣ : ");
			String phone = util.inputScanStr();
			addLottery[i] = new Set_Lottery(name, phone);
			if(lc.insertObject(addLottery[i])==true) {
				System.out.println(name + "��, �߰� �Ϸ�");
			}else {
				System.out.println("�̹� �ִ� ����Դϴ�. �ٽ� ������ּ���");
				i--;
			}
		}

	}

	public void deleteObject() {
		System.out.print("���� ��� �̸� : ");
		String name = util.inputScanStr();
		System.out.print("���� ��� ��ȣ : ");
		String phone = util.inputScanStr();

		Set_Lottery lottery = new Set_Lottery(name, phone);

		if (lc.deleteObject(lottery) == true) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");

		}

	}

	public void winObject() {

		HashSet<Set_Lottery> win = new HashSet<Set_Lottery>();	
		
		win = lc.winObject();
		
		
		if (win==null) {
			
			System.out.println("��÷�� ����ڰ� �����ϴ�.");
			
			
		}else {
			
			System.out.println(win);
			
		}
		

	}

	public void sortedWinObject() {

		Iterator<Set_Lottery> iterator = lc.sortedWinObject().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public void searchWinner() {
		System.out.print("�˻� ��� �̸� : ");
		String name = util.inputScanStr();
		System.out.print("�˻� ��� ��ȣ : ");
		String phone = util.inputScanStr();

		Set_Lottery lottery = new Set_Lottery(name, phone);

		if (lc.searchWinner(lottery) == true) {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		} else {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}

	}

}
