package com.kh.practice.chap02_abstractNInterface;

public class AbstractInterface_V40 extends AbstractInterface_SmartPhone implements AbstractInterface_NotePen {

	String printInfo;
	{

		printInfo = "V40�� " + this.getMaker() + makeCall() + takeCall() + picture() + charge() + touch() + "������� �� ž�翩�� : "
				+ bluetoothPen();
	}

	public AbstractInterface_V40() {
		setMaker("LG");
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
		String str = "1200, 1600�� Ʈ����ī�޶�\n";

		return str;

	}

	@Override
	public String charge() {
		String str = "�������, ��� ���� ����\n";

		return str;
	}

	@Override
	public String touch() {
		String str = "������\n";

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
