package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Set_Lottery;

public class Set_LotteryController {

	private HashSet<Set_Lottery> lottery = new HashSet<Set_Lottery>();
	private HashSet<Set_Lottery> win = new HashSet<Set_Lottery>();

	public boolean insertObject(Set_Lottery l) {
		return lottery.add(l);

	}

	public boolean deleteObject(Set_Lottery l) {

		List<Set_Lottery> al = new ArrayList<Set_Lottery>(win);


		for (int i = 0; i < win.size(); i++) {

			if (al.get(i).equals(l) == true) {
				lottery.remove(l);
				break;
			}

		}

		return lottery.remove(l);

	}

	public HashSet<Set_Lottery> winObject() {
		if(win.size()>=lottery.size()) {
			return null;
		}
		List<Set_Lottery> al = new ArrayList<Set_Lottery>(lottery);

		
		
		while (true) {
			int ran = new Random().nextInt(al.size());
			if (win.add(al.get(ran)) == false) {
				continue;
				}
			break;
		}

		return win;

	}


	public TreeSet<Set_Lottery> sortedWinObject() {
		TreeSet<Set_Lottery> ts = new TreeSet<Set_Lottery>(win);
		return ts;

	}

	public boolean searchWinner(Set_Lottery l) {

		boolean search = false;
		
		List<Set_Lottery> al = new ArrayList<Set_Lottery>(win);


		for (int i = 0; i < win.size(); i++) {

			if (al.get(i).equals(l) == true) {
				search = true;
				break;
			}

		}

		return search;

	}

}
