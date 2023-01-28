package seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex04;

import seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex05.Book;

public class BookArray {
	public static void main(String[] args) {
		seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex05.Book[] library = new seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex05.Book[5];
		
		library[0] = new seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex05.Book("태백산맥", "조정래");
		library[1] = new seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex05.Book("데미안", "헤르만 헤세");
		library[2] = new seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex05.Book("어떻게 살 것인가", "유시민");
		library[3] = new seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex05.Book("토지", "박경리");
		library[4] = new Book("어린완자", "생텍쥐페리");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
