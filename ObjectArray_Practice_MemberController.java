package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.ObjectArray_Practice_Member;

public class ObjectArray_Practice_MemberController {

	private ObjectArray_Practice_Member[] m = new ObjectArray_Practice_Member[SIZE];
	public static final int SIZE = 10;

	public int existMemberNum() {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				count++;
			}

		}
		return count;
	}

	public boolean checkId(String inputId) {
		boolean overlap = false;
		
		
		for (int i = 0; i < m.length; i++) {
			
			if (m[i]==null) {
				overlap = false;
				break;
			}
			if(m[i].getId().equals(inputId)) {
				overlap = true;
				break;
			}
		}
		
		return overlap;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new ObjectArray_Practice_Member(id, name, password, email, gender, age);
				break;
			}
		}
	}

	public String searchId(String id) {
		String str = "";

		for (int i = 0; i < m.length; i++) {
			if (m[i].getId().equals(id)) {
				str += m[i].getId() + " ";
				str += m[i].getName() + " ";
				str += m[i].getPassword() + " ";
				str += m[i].getEmail() + " ";
				str += m[i].getGender() + " ";
				str += m[i].getAge() + " ";

				break;
			}

		}

		return str;
	}

	public ObjectArray_Practice_Member[] searchName(String name) {
		ObjectArray_Practice_Member[] nameSearch = new ObjectArray_Practice_Member[SIZE];
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i]==null) {
				continue;
			}
			else if (m[i].getName().equals(name)) {
				nameSearch[count] = m[i];
				count++;

			}

		}

		return nameSearch;

	}

	public ObjectArray_Practice_Member[] searchEmail(String email) {
		ObjectArray_Practice_Member[] emailSearch = new ObjectArray_Practice_Member[SIZE];
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			
			if (m[i]==null) {
				continue;
			}
			if (m[i].getEmail().equals(email)) {
				emailSearch[count] = m[i];
				count++;

			}

		}

		return emailSearch;

	}

	public boolean updatePassword(String id, String password) {
		boolean modifyPass = false;
		for (int i = 0; i < m.length; i++) {
			
			if (m[i]==null) {
				continue;
			}
			
			if (m[i].getId().equals(id)) {
				m[i].setPassword(password);
				modifyPass = true;
				break;
			}
		}
		return modifyPass;
	}

	public boolean updateName(String id, String name) {
		boolean modifyName = false;
		for (int i = 0; i < m.length; i++) {
			
			if (m[i]==null) {
				continue;
			}
			if (m[i].getId().equals(id)) {
				m[i].setName(name);
				modifyName = true;
				break;
			}
		}
		return modifyName;

	}

	public boolean updateEmail(String id, String email) {
		boolean modifyEmail = false;
		for (int i = 0; i < m.length; i++) {
			
			if (m[i]==null) {
				continue;
			}
			if (m[i].getId().equals(id)) {
				m[i].setEmail(email);
				modifyEmail = true;
				break;
			}
		}
		return modifyEmail;

	}

	public boolean delete(String id) {

		boolean delete = false;
		for (int i = 0; i < m.length; i++) {
			if (m[i]==null) {
				continue;
			}
			
			if (m[i].getId().equals(id)) {
				m[i] = null;
				delete = true;
				break;
			}
		}
		return delete;

	}

	public void delete() {
		for (int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	public ObjectArray_Practice_Member[] printAll() {
		ObjectArray_Practice_Member[] AllMember = new ObjectArray_Practice_Member[SIZE];
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				AllMember[count] = m[i];
				count++;

			}
		}
		return AllMember;
	}
}
