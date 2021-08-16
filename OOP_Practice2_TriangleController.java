package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.OOP_Practice2_Shape;

public class OOP_Practice2_TriangleController {
	private OOP_Practice2_Shape s = new OOP_Practice2_Shape();

	public double calcArea(double height, double width) {
		s.setType(3);
		s.setWidth(width);
		s.setHeight(height);

		return height * width;
	}

	public void paintColor(String color) {

		s.setColor(color);
	}

	public String print() {
		return "»ç°¢Çü " + s.information();
	}

}
