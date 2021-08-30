package com.kh.practice.map.view;

import com.kh.practice.map.controller.Map_MemberController;
import com.kh.practice.map.model.vo.Map_Member;
import com.kh.practice.map.util.Map_Util;

public class Map_MemberMenu {

	private Map_MemberController mc = new Map_MemberController();
	private Map_Util util = new Map_Util();

	public void mainMenu() {
		while (true) {
			System.out.println("========== KH  사이트  ==========");

			System.out.println("*******  메인  메뉴  *******");
			System.out.println("1.  회원가입"); // joinMembership() 실행
			System.out.println("2.  로그인"); // logIn() 실행 후 memberMenu() 실행
			System.out.println("3.  같은  이름  회원  찾기"); // sameName()
			System.out.println("9.  종료"); // “프로그램 종료.” 출력 후 main()으로 리턴
			System.out.print("메뉴  번호  선택  : "); // >> 입력 받음
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
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}

		}

	}

	public void memberMenu() {
		while (true) {
			System.out.println("*******  회원  메뉴  *******");
			System.out.println("1.  비밀번호 바꾸기");
			System.out.println("2.  이름 바꾸기");
			System.out.println("3.  로그아웃");

			System.out.print("메뉴  번호  선택  : ");
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
				System.out.println("다시 입력해주세요.");
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

			System.out.println("성공적으로 회원가입 완료하였습니다.");

		} else {

			System.out.println("중복 된 아이디입니다.");

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

				System.out.println(userName + "님, 환영합니다.");
				memberMenu();
			} else {

				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시입력해주세요.");
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
		
		System.out.print("변경하실 PW : ");
		String newPw = util.inputScanStr();
		
		if(mc.changePassword(id, pw, newPw)==true) {
			System.out.println("비밀번호 변경에 성공했습니다.");
			break;
		}else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			
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

				System.out.println(userName + "님, 환영합니다.");

				System.out.print("변경하실 이름 : ");
				newName = util.inputScanStr();

				mc.changeName(id, newName);
				System.out.println("이름 변경에 성공하였습니다.");
				break;

			} else {

				System.out.println("이름변경에 실패하였습니다. 다시입력해주세요.");
				continue;
			}

		}

	}

	public void sameName() {
		
		System.out.print("검색할 이름 : ");
		String name = util.inputScanStr();
		
		System.out.println(mc.sameName(name).entrySet());

	}

}
