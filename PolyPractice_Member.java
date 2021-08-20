package com.kh.practice.chap01_poly.model.vo;

public class PolyPractice_Member {
	private String name; // ȸ����
	private int age; // ȸ������
	private char gender; // ����
	private int couponCount = 0; // �丮�п��������� = 0

	public PolyPractice_Member() {

	}

	public PolyPractice_Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

}
