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
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ������ ��ġ�� �� �߰�"); // addList() ����
			System.out.println("2. ù ��ġ�� �� �߰�"); // addAtZero()
			System.out.println("3. ��ü �� ��� ���"); // printAll()
			System.out.println("4. Ư�� �� �˻�"); // searchMusic()
			System.out.println("5. Ư�� �� ����"); // removeMusic()
			System.out.println("6. Ư�� �� ���� ����"); // setMusic()
			System.out.println("7. ��� �������� ����"); // ascTitle()
			System.out.println("8. ������ �������� ����"); // descSinger()
			System.out.println("9. ����"); // �����ᡱ ��� �� main()���� ����
			System.out.print("�޴� ��ȣ ���� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
				
			default:
				continue;

			}

		}

	}

	public void addList() {
		System.out.print("����� �Է��Ͻÿ� : ");
		String title = util.inputScanStr();
		System.out.print("�������� �Է��Ͻÿ� : ");
		String singer = util.inputScanStr();
		
		int num = mc.addList(new ArrayList2_Music(title, singer));
		
		if(num == 1) {
			System.out.println("�߰� ����");
		}else {
			System.out.println("�߰� ����");
		}
	}

	public void addAtZero() {
		System.out.print("����� �Է��Ͻÿ� : ");
		String title = util.inputScanStr();
		System.out.print("�������� �Է��Ͻÿ� : ");
		String singer = util.inputScanStr();
		
		int num = mc.addAtZero(new ArrayList2_Music(title, singer));
		
		if(num == 1) {
			System.out.println("�߰� ����");
		}else {
			System.out.println("�߰� ����");
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
		
		System.out.print("����� �Է��Ͻÿ� : ");
		String title = util.inputScanStr();
		
		
		if(mc.searchMusic(title)==null) {
			System.out.println("ã���ô� �뷡�� �����ϴ�.");
		}else {
		System.out.println(mc.searchMusic(title).toString());
		
		}
	}

	public void removeMusic() {

		System.out.print("�����Ͻ� ����� �Է��Ͻÿ� : ");
		String title = util.inputScanStr();
		System.out.print("�����Ͻ� �������� �Է��Ͻÿ� : ");
		String singer = util.inputScanStr();
		
		ArrayList2_Music music = mc.removeMusic(title,singer);
		if(music==null) {
			System.out.println("������ �뷡�� �����ϴ�.");
		}else {
			System.out.println(music.toString() + "�� �����߽��ϴ�.");	
		}
		
		
	}

	public void setMusic() {
		System.out.print("�����Ͻ� ����� �Է��Ͻÿ� : ");
		String title = util.inputScanStr();
		System.out.print("�����Ͻ� ����� �Է��Ͻÿ� : ");
		String setTitle = util.inputScanStr();
		System.out.print("�����Ͻ� �������� �Է��Ͻÿ� : ");
		String setSinger = util.inputScanStr();

	ArrayList2_Music music = mc.setMusic(title, new ArrayList2_Music(setTitle,setSinger));
		
		if(music == null) {
			System.out.println("������ ���� �����ϴ�.");
		}else {
			System.out.println(music.toString() + "�� ���� ����Ǿ����ϴ�.");
		}
		
		
	}

	public void ascTitle() {
		if(mc.ascTitle() == 1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}

	public void descSinger() {
		if(mc.descSinger() == 1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}

	}
}
