package com.kh.hw.employee.controller;

import com.kh.hw.employee.vo.OOP_Practice_Employee;

public class OOP_Practice_EmployeeController {
	private OOP_Practice_Employee e = new OOP_Practice_Employee();

	public void add(int empNo, String name, char gender, String phone) {
		e = new OOP_Practice_Employee(empNo, name, gender, phone);

	}

	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		e = new OOP_Practice_Employee(empNo, name, gender, phone, dept, salary, bonus);
	}

	public void modify(String phone) {
		e.setPhone(phone);

	}

	public void modify(int salary) {
		e.setSalary(salary);

	}

	public void modify(double bonus) {
		e.setBonus(bonus);
	}

	public void remove() {

		e = null;

	}

	public String inform() {

		if (e == null) {
			return null;
		} else {
			return e.printEmployee();
		}

	}
}
