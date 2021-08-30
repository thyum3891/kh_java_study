package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class ArrayList2_Music implements Comparable<ArrayList2_Music> {

	private String title;
	private String singer;

	public ArrayList2_Music() {
	}

	public ArrayList2_Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayList2_Music other = (ArrayList2_Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	@Override
	public int compareTo(ArrayList2_Music o) {
		
		int result = this.getTitle().compareTo(o.getTitle());
		
		return result;

	}
	
	public int compareTo2(ArrayList2_Music o) {
		
		int result = this.getTitle().compareTo(o.getTitle())*-1;
		
		return result;
		
	}

}
