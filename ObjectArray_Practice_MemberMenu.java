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

			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명 입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명 입니다.");

			if (mc.existMemberNum() != mc.SIZE) {
				System.out.println("1. 새 회원 등록");
			}

			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");
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
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
				continue;
			}

		}

	}

	public void insertMember() {
		String id = "";
		char gender = 0;
		while(true){
		System.out.print("아이디 : ");
		id         =  sc.nextLine();
		if((mc.checkId(id))) {
			System.out.println("중복 된 아이디입니다. 다시 입력해주세요.");
			continue;
			}else {
				break;
			}
		
		}
		System.out.print("이름 : ");
		String name       =  sc.nextLine();
		System.out.print("비밀번호 : ");
		String password   =  sc.nextLine();
		System.out.print("이메일 : ");
		String email      =  sc.nextLine();
		while(true) {
		System.out.print("성별(M/F) : ");
		gender       =  (sc.nextLine().toUpperCase()).charAt(0);
		if(gender=='M'||gender=='F') {
			break;
		}else {
			System.out.println("다시 입력해주세요.");
			continue;
		}
		}
		System.out.print("나이 : ");
		int age           =  Integer.parseInt(sc.nextLine());
		
		mc.insertMember(id, name, password, email, gender, age);

	}

	public void searchMember() {
		
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");

		System.out.print("메뉴 번호 : ");
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
			System.out.println("메인으로 돌아갑니다.");
			break;
			
		default :
			System.out.println("잘못입력하셨습니다.");
			break;
		}

	}

	public void searchId() {
		
		System.out.print("검색할 아이디 : ");
		String id = sc.nextLine();
		
		if(mc.searchId(id).equals("")) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(id));
		}
		

	}

	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		if(mc.searchName(name)==null) {
			System.out.println("검색 결과가 없습니다.");
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
		System.out.print("검색할 이메일 : ");
		String email = sc.nextLine();
		
		if(mc.searchName(email)==null) {
			System.out.println("검색 결과가 없습니다.");
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
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");

		System.out.print("메뉴 번호 : ");
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
			System.out.println("메인으로 돌아갑니다.");
			break;
			
		default :
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}

	public void updatePassword() {
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.nextLine();

		System.out.print("수정할 패스워드 : ");
		String pass = sc.nextLine();
		
		mc.updatePassword(id, pass);
		
		if(mc.updatePassword(id, pass)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
		
	}

	public void updateName() {
		
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.nextLine();

		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		
		mc.updateName(id, name);
		
		if(mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}

	public void updateEmail() {
		
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.nextLine();

		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();
		
		mc.updateEmail(id, email);
		
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}


	}

	public void deleteMember() {
		
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");

		System.out.print("메뉴 번호 : ");
		int selectMenu = Integer.parseInt(sc.nextLine());
		
		switch(selectMenu) {
		
		case 1 : 
			deleteOne();
			break;
		case 2 :
			deleteAll();
			break;
		case 9 : 
			System.out.println("메인메뉴로 돌아갑니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
			
			
		}
		
		

	}

	public void deleteOne() {
		
		System.out.print("삭제할 회원 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("정말로 삭제하시겠습니까? : ");
		char deleteSelect       =  (sc.nextLine().toUpperCase()).charAt(0);
		if(deleteSelect=='Y') {
			if(mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.");
			}else {
				System.out.println("존재하지않는 아이디입니다.");
			}
		}else if(deleteSelect=='N') {
			System.out.println("삭제를 취소했습니다. 메인으로 돌아갑니다.");
		}else {
			System.out.println("잘못입력하셨습니다. 메인으로 돌아갑니다.");
		}

	}

	public void deleteAll() {
		
		System.out.print("정말로 삭제하시겠습니까? : ");
		char deleteSelect       =  (sc.nextLine().toUpperCase()).charAt(0);
		if(deleteSelect=='Y') {
			mc.delete();
				System.out.println("성공적으로 삭제하였습니다.");
			

		}else if(deleteSelect=='N') {
			System.out.println("삭제를 취소했습니다. 메인으로 돌아갑니다.");
		}else {
			System.out.println("잘못입력하셨습니다. 메인으로 돌아갑니다.");
		}

	}

	public void printAll() {
		
		if(mc.existMemberNum()==0) {
			System.out.println("저장 된 회원이 없습니다.");
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
