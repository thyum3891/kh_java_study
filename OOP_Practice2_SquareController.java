package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.OOP_Practice2_Shape;

public class OOP_Practice2_SquareController {

	private OOP_Practice2_Shape s = new OOP_Practice2_Shape();

	public double calcPerimeter(double height, double width) {

		s.setType(4);
		s.setWidth(width);
		s.setHeight(height);

		return width * 2 + height * 2;
	}

	public double calcArea(double height, double width) {
		s.setType(4);
		s.setWidth(width);
		s.setHeight(height);

		return width * height;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return "»ç°¢Çü " + s.information();

	}

}
