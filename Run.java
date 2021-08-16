package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee el = new Employee();
		el.Employee(100, "홍길동", "영업부", "과장", 25, '남', 2500000, 0.05, "010-1234-5678", "서울시 강남구");
		
		System.out.println(el.getEmpNo());
		System.out.println(el.getEmpName());
		System.out.println(el.getDept());
		System.out.println(el.getJop());
		System.out.println(el.getAge());
		System.out.println(el.getGender());
		System.out.println(el.getSalary());
		System.out.println(el.getBonusPoint());
		System.out.println(el.getPhone());
		System.out.println(el.getAddress());
		
	}

}
