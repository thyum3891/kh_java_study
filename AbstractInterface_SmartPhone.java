package com.kh.practice.chap02_abstractNInterface;

public abstract class AbstractInterface_SmartPhone implements AbstractInterface_CellPhone, AbstractInterface_TouchDisplay {

	private String maker;// 제조사 정보
	
	public AbstractInterface_SmartPhone() {

	}	
	
	public abstract String printInformation();

	public String getMaker() {
		return maker+"에서 만들어졌고 제원은 다음과 같다.\n";
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	

}
