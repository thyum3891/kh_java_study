package com.kh.practice.set.model.vo;

import java.util.Objects;

public class Set_Lottery implements Comparable<Set_Lottery>{

	private String name;
	private String phone;

	public Set_Lottery() {
	}

	public Set_Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Set_Lottery other = (Set_Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	@Override
	public int compareTo(Set_Lottery o) {
		int result = this.name.compareTo(o.name);
		return result;
	}

}
