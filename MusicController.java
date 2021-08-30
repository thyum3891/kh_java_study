package com.kh.practice.list.music.model.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<Music>();

	public int addList(Music music){
		list.add(music);
				return 1;
			}

	public int addAtZero(Music music){
		
		list.add(0, music);
		
		return 1;
				
			}

	public List<Music> printAll() {
		return list;

	}

	public Music searchMusic(String title){
		
		for(int i = 0; i<list.size() ; i++ ) {
			if(list.get(i).getTitle().equals(title)==true) {
				return list.get(i);
			}
		}
		return null;
				
			}

	public Music removeMusic(String title, String singer){
		
		Music music = new Music();
		
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

	public Music setMusic(String title, Music music){
		for(int i = 0; i<list.size() ; i++ ) {
			if(list.get(i).getTitle().equals(title)==true) {
				list.set(i, music);
				return list.get(i);
			}
		}
		return null;
			}

	public int ascTitle(){
		list.sort(new Comparator<Music>() {

			@Override
			public int compare(Music o1, Music o2) {
				int resurt = o1.getSinger().compareTo(o2.getSinger());
				return resurt;
			}
			
		});
		
		Collections.sort(list);
		
		return 1;

	}

	public int descSinger(){
		
		list.sort(new Comparator<Music>() {

			@Override
			public int compare(Music o1, Music o2) {
				int resurt = o1.getSinger().compareTo(o2.getSinger())*-1;
				return resurt;
			}
			
		});
		
		
//		Collections.sort(list,Collections.reverseOrder());
		return 1;

	}

}
