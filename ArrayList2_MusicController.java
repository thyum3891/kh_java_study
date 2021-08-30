package com.kh.practice.list.music.model.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.vo.ArrayList2_Music;

public class ArrayList2_MusicController {

	private List<ArrayList2_Music> list = new ArrayList<ArrayList2_Music>();

	public int addList(ArrayList2_Music music){
		list.add(music);
				return 1;
			}

	public int addAtZero(ArrayList2_Music music){
		
		list.add(0, music);
		
		return 1;
				
			}

	public List<ArrayList2_Music> printAll() {
		return list;

	}

	public ArrayList2_Music searchMusic(String title){
		
		for(int i = 0; i<list.size() ; i++ ) {
			if(list.get(i).getTitle().equals(title)==true) {
				return list.get(i);
			}
		}
		return null;
				
			}

	public ArrayList2_Music removeMusic(String title, String singer){
		
		ArrayList2_Music music = new ArrayList2_Music();
		
		for(int i = 0; i<list.size() ; i++ ) {
			if(list.get(i).getTitle().equals(title)==true&&
					list.get(i).getSinger().equals(singer)==true	) {
				music = list.get(i);
				list.remove(i);
				return music;
			}
		}
		return null;
				
				
			}

	public ArrayList2_Music setMusic(String title, ArrayList2_Music music){
		for(int i = 0; i<list.size() ; i++ ) {
			if(list.get(i).getTitle().equals(title)==true) {
				list.set(i, music);
				return list.get(i);
			}
		}
		return null;
			}

	public int ascTitle(){
		list.sort(new Comparator<ArrayList2_Music>() {

			@Override
			public int compare(ArrayList2_Music o1, ArrayList2_Music o2) {
				int resurt = o1.getSinger().compareTo(o2.getSinger());
				return resurt;
			}
			
		});
		
		Collections.sort(list);
		
		return 1;

	}

	public int descSinger(){
		
		list.sort(new Comparator<ArrayList2_Music>() {

			@Override
			public int compare(ArrayList2_Music o1, ArrayList2_Music o2) {
				int resurt = o1.getSinger().compareTo(o2.getSinger())*-1;
				return resurt;
			}
			
		});
		
		
//		Collections.sort(list,Collections.reverseOrder());
		return 1;

	}

}
