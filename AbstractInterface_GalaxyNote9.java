package com.kh.practice.chap02_abstractNInterface;

public class AbstractInterface_GalaxyNote9 extends AbstractInterface_SmartPhone implements AbstractInterface_NotePen {

	
	public AbstractInterface_GalaxyNote9() {
		super.setMaker("�Ｚ");
	}
	



	@Override
	public String makeCall() {
		String str = "��ȣ�� ������ ��ȭ��ư�� ����\n";

		return str;

	}

	@Override
	public String takeCall() {
		String str = "��ȭ�ޱ� ��ư�� ����\n";

		return str;

	}

	@Override
	public String picture() {
		String str = "1300�� ���ī�޶�\n";

		return str;

	}

	@Override
	public String charge() {
		String str = "�������, ��� ���� ����\n";

		return str;
	}

	@Override
	public String touch() {
		String str = "������, ����������\n";

		return str;
	}

	@Override
	public boolean bluetoothPen() {

		return true;

	}

	@Override
	public String printInformation() {

		return "GalaxyNote9�� " + super.getMaker() + makeCall() + takeCall() + picture() + charge() + touch()
		+ "������� �� ž�翩�� : " + bluetoothPen();

	}

}
