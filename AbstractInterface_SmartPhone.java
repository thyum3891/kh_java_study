package com.kh.practice.chap02_abstractNInterface;

public abstract class AbstractInterface_SmartPhone implements AbstractInterface_CellPhone, AbstractInterface_TouchDisplay {

	private String maker;// ������ ����
	
	public AbstractInterface_SmartPhone() {

	}	
	
	public abstract String printInformation();

	public String getMaker() {
		return maker+"���� ��������� ������ ������ ����.\n";
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	

}
