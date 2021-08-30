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
			
			System.out.println("========== KH  추첨  프로그램  ==========");
			StringBuffer sb = new StringBuffer();
			sb.append("*******  메인  메뉴  *******\n");
			sb.append("1.  추첨  대상  추가\n");
			sb.append("2.  추첨  대상  삭제\n");
			sb.append("3.  당첨  대상  확인\n");
			sb.append("4.  정렬된  당첨  대상  확인\n");
			sb.append("5.  당첨  대상  검색\n");
			sb.append("9.  종료\n");
			sb.append("메뉴  번호  선택 : ");
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
				System.out.println("프로그램 종료");
				return;
				
			default:
				System.out.println("다시 입력해주세요.");
				continue;

			}

		}

	}

	public void insertObject() {

		System.out.print("추가할 추첨 대상 수 : ");
		int add = util.inputScanInt();
		Set_Lottery[] addLottery = new Set_Lottery[add];
		for (int i = 0; i < add; i++) {
			System.out.print(i+"번째, 추가 대상 이름 : ");
			String name = util.inputScanStr();
			System.out.print(i+"번째, 추가 대상 번호 : ");
			String phone = util.inputScanStr();
			addLottery[i] = new Set_Lottery(name, phone);
			if(lc.insertObject(addLottery[i])==true) {
				System.out.println(name + "님, 추가 완료");
			}else {
				System.out.println("이미 있는 대상입니다. 다시 등록해주세요");
				i--;
			}
		}

	}

	public void deleteObject() {
		System.out.print("삭제 대상 이름 : ");
		String name = util.inputScanStr();
		System.out.print("삭제 대상 번호 : ");
		String phone = util.inputScanStr();

		Set_Lottery lottery = new Set_Lottery(name, phone);

		if (lc.deleteObject(lottery) == true) {
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");

		}

	}

	public void winObject() {

		HashSet<Set_Lottery> win = new HashSet<Set_Lottery>();	
		
		win = lc.winObject();
		
		
		if (win==null) {
			
			System.out.println("추첨할 대상자가 없습니다.");
			
			
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
		System.out.print("검색 대상 이름 : ");
		String name = util.inputScanStr();
		System.out.print("검색 대상 번호 : ");
		String phone = util.inputScanStr();

		Set_Lottery lottery = new Set_Lottery(name, phone);

		if (lc.searchWinner(lottery) == true) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}

	}

}
