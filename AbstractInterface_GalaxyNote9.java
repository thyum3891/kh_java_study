package com.kh.practice.chap02_abstractNInterface;

public class AbstractInterface_GalaxyNote9 extends AbstractInterface_SmartPhone implements AbstractInterface_NotePen {

	
	public AbstractInterface_GalaxyNote9() {
		super.setMaker("삼성");
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
		String str = "1300만 듀얼카메라\n";

		return str;

	}

	@Override
	public String charge() {
		String str = "고속충전, 고속 무선 충전\n";

		return str;
	}

	@Override
	public String touch() {
		String str = "정전식, 와콤펜지원\n";

		return str;
	}

	@Override
	public boolean bluetoothPen() {

		return true;

	}

	@Override
	public String printInformation() {

		return "GalaxyNote9는 " + super.getMaker() + makeCall() + takeCall() + picture() + charge() + touch()
		+ "블루투스 펜 탑재여부 : " + bluetoothPen();

	}

}
