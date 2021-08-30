package com.kh.practice.list.music.view;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.controller.ArrayList2_MusicController;
import com.kh.practice.list.music.model.vo.ArrayList2_Music;
import com.kh.practice.list.music.util.ArrayList2_Util;

public class ArrayList2_MusicView {
	private ArrayList2_MusicController mc = new ArrayList2_MusicController();
	private ArrayList2_Util util = new ArrayList2_Util();

	public void mainMenu() {
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가"); // addList() 실행
			System.out.println("2. 첫 위치에 곡 추가"); // addAtZero()
			System.out.println("3. 전체 곡 목록 출력"); // printAll()
			System.out.println("4. 특정 곡 검색"); // searchMusic()
			System.out.println("5. 특정 곡 삭제"); // removeMusic()
			System.out.println("6. 특정 곡 정보 수정"); // setMusic()
			System.out.println("7. 곡명 오름차순 정렬"); // ascTitle()
			System.out.println("8. 가수명 내림차순 정렬"); // descSinger()
			System.out.println("9. 종료"); // “종료” 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : ");
			int selectNum = util.inputScanInt();

			switch (selectNum) {

			case 1:
				addList();
				break;

			case 2:
				addAtZero();
				break;

			case 3:
				printAll();
				break;
				
			case 4:
				searchMusic();
				break;
				
			case 5:
				removeMusic();
				break;
				
			case 6:
				setMusic();
				break;
				
			case 7:
				ascTitle();
				break;
				
			case 8:
				descSinger();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				continue;

			}

		}

	}

	public void addList() {
		System.out.print("곡명을 입력하시오 : ");
		String title = util.inputScanStr();
		System.out.print("가수명을 입력하시오 : ");
		String singer = util.inputScanStr();
		
		int num = mc.addList(new ArrayList2_Music(title, singer));
		
		if(num == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}

	public void addAtZero() {
		System.out.print("곡명을 입력하시오 : ");
		String title = util.inputScanStr();
		System.out.print("가수명을 입력하시오 : ");
		String singer = util.inputScanStr();
		
		int num = mc.addAtZero(new ArrayList2_Music(title, singer));
		
		if(num == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}

	}

	public void printAll() {
		
		List<ArrayList2_Music> list = new ArrayList<ArrayList2_Music>();
		list.addAll(mc.printAll());
		
		for(int i = 0 ; i< list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		
	}

	public void searchMusic() {
		
		System.out.print("곡명을 입력하시오 : ");
		String title = util.inputScanStr();
		
		
		if(mc.searchMusic(title)==null) {
			System.out.println("찾으시는 노래가 없습니다.");
		}else {
		System.out.println(mc.searchMusic(title).toString());
		
		}
	}

	public void removeMusic() {

		System.out.print("삭제하실 곡명을 입력하시오 : ");
		String title = util.inputScanStr();
		System.out.print("삭제하실 가수명을 입력하시오 : ");
		String singer = util.inputScanStr();
		
		ArrayList2_Music music = mc.removeMusic(title,singer);
		if(music==null) {
			System.out.println("삭제할 노래가 없습니다.");
		}else {
			System.out.println(music.toString() + "을 삭제했습니다.");	
		}
		
		
	}

	public void setMusic() {
		System.out.print("선택하실 곡명을 입력하시오 : ");
		String title = util.inputScanStr();
		System.out.print("변경하실 곡명을 입력하시오 : ");
		String setTitle = util.inputScanStr();
		System.out.print("변경하실 가수명을 입력하시오 : ");
		String setSinger = util.inputScanStr();

	ArrayList2_Music music = mc.setMusic(title, new ArrayList2_Music(setTitle,setSinger));
		
		if(music == null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println(music.toString() + "의 값이 변경되었습니다.");
		}
		
		
	}

	public void ascTitle() {
		if(mc.ascTitle() == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}

	public void descSinger() {
		if(mc.descSinger() == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}

	}
}
