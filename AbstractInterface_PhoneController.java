package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.AbstractInterface_GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.AbstractInterface_Phone;
import com.kh.practice.chap02_abstractNInterface.AbstractInterface_V40;

public class AbstractInterface_PhoneController {

	private String[] result = new String[2];

	public String[] method() {

		AbstractInterface_Phone[] phoneArray = new AbstractInterface_Phone[2];
		phoneArray[0] = new AbstractInterface_GalaxyNote9();
		phoneArray[1] = new AbstractInterface_V40();

		for (int i = 0; i < phoneArray.length; i++) {

			if ((phoneArray[i] instanceof AbstractInterface_GalaxyNote9) == true) {

				result[i] = ((AbstractInterface_GalaxyNote9) (phoneArray[i])).printInformation();

			} else if ((phoneArray[i] instanceof AbstractInterface_V40) == true) {

				result[i] = ((AbstractInterface_V40) (phoneArray[i])).printInformation();

			}
		}

		return result;

	}

}
