package seunghee.study.Do_It_자바_프로그래밍_입문._07_배열과_ArrayList._03_ArrayList_클래스_사용하기;

public class _01_Book {
	private String bookName;
	private String author;
	
	public _01_Book() {}
	
	public _01_Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName+", "+author);
	}
}
