package seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._01_Object_클래스;

public class _01_Book {
	int bookNumber;
	String bookTitle;
	
	_01_Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}
