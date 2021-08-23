package com.kh.practice.chap02_abstractNInterface;

public class AbstractInterface_V40 extends AbstractInterface_SmartPhone implements AbstractInterface_NotePen {

	String printInfo;
	{

		printInfo = "V40은 " + this.getMaker() + makeCall() + takeCall() + picture() + charge() + touch() + "블루투스 펜 탑재여부 : "
				+ bluetoothPen();
	}

	public AbstractInterface_V40() {
		setMaker("LG");
	}
	
	@Override
	public String makeCall() {
		String str = "번호를 누르고 통화버튼을 누름\n";

		return str;

	}

	@Override
	public String takeCall() {
		String str = "전화받기 버튼을 누름\n";

		return str;

	}

	@Override
	public String picture() {
		String str = "1200, 1600만 트리플카메라\n";

		return str;

	}

	@Override
	public String charge() {
		String str = "고속충전, 고속 무선 충전\n";

		return str;
	}

	@Override
	public String touch() {
		String str = "정전식\n";

		return str;
	}

	@Override
	public boolean bluetoothPen() {

		return false;

	}

	@Override
	public String printInformation() {

		return printInfo;

	}

}
