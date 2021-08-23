package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.AbstractInterface_PhoneController;

public class AbstractInterface_Run {

	public static void main(String[] args) {

		AbstractInterface_PhoneController phoneController = new AbstractInterface_PhoneController();
		String[] strArr = phoneController.method();
		
		for(int i = 0 ; i < strArr.length ; i++) {
			System.out.println(strArr[i]+"\n");
		}
		
	}

}
