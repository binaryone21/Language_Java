package seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._01_Object_클래스.ex01;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}
