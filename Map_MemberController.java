package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Map_Member;

public class Map_MemberController {

	private HashMap<String, Map_Member> map = new HashMap<String, Map_Member>();

	public boolean joinMembership(String id, Map_Member m) {

		if (map.containsKey(id) == false) {
			map.put(id, m);
			return true;
		}
		return false;
	}

	public String logIn(String id, String password) {

		if (map.containsKey(id) == true) {
			if (map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public boolean changePassword(String id, String oldPw, String newPw) {

		boolean idCheck = map.containsKey(id);
		boolean pwCheck = map.get(id).getPassword().equals(oldPw);

		if (idCheck == true && pwCheck == true) {

			map.get(id).setPassword(newPw);

			return true;

		} else {

			return false;

		}

	}

	public void changeName(String id, String newName) {

		map.get(id).setPassword(newName);

	}

	public TreeMap<String, Map_Member> sameName(String name) {
		
		TreeMap<String, Map_Member> tm = new TreeMap<String, Map_Member>();

		
			for (String str : map.keySet()) {

				if (name.equals(map.get(str).getName())) {

					tm.put(str, map.get(str));
					
				}

			}
			
		
			return tm;

	}

}
