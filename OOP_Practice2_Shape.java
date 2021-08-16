package com.kh.hw.shape.model.vo;

public class OOP_Practice2_Shape {
	private int    type  ;
	private double height;
	private double width ;
	private String color = "white";

	
	public OOP_Practice2_Shape() {
		
	}
	public OOP_Practice2_Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	public String information(){
		String str = "";
		str += height + " ";
		str += width + " ";
		str += color + " ";
		
		return str;
	}
	public void setType(int type) {
		this.type = type;
		
	}
	public int getType() {
		return type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
