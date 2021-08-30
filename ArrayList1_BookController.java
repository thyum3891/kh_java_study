package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.ArrayList1_Book;

public class ArrayList1_BookController {

	private List<ArrayList1_Book> bookList = new ArrayList<ArrayList1_Book>();

	public ArrayList1_BookController() {

		bookList.add(new ArrayList1_Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new ArrayList1_Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new ArrayList1_Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new ArrayList1_Book("암 정복기", "박신우", "의료", 21000));

	}

	public void insertBook(ArrayList1_Book bk) {
		bookList.add(bk);
	}

	public ArrayList<ArrayList1_Book> selectList() {

		return (ArrayList<ArrayList1_Book>) bookList;

	}

	public ArrayList<ArrayList1_Book> searchBook(String keyword) {

		List<ArrayList1_Book> searchList = new ArrayList<ArrayList1_Book>();

		for (int i = 0; i < bookList.size(); i++) {
			if ((bookList.get(i).getTitle().contains(keyword)) == true) {
				searchList.add(bookList.get(i));
			}
		}

		return (ArrayList<ArrayList1_Book>) searchList;
	}

	public ArrayList1_Book deleteBook(String title, String author) {
		int i = 0;

		ArrayList1_Book removeBook = new ArrayList1_Book();

		for (i = 0; i < bookList.size(); i++) {
			boolean check1 = bookList.get(i).getAuthor().equals(author);
			boolean check2 = bookList.get(i).getTitle().equals(title);
			if (check1 == true && check2 == true) {

				removeBook = bookList.get(i);
				bookList.remove(i);
				break;
			} else {
				removeBook = null;
			}
		}

		return removeBook;

	}

	public int ascBook() {

		Collections.sort(bookList);

		return 1;
	}

}
