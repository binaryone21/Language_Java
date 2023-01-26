package seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._01_Object_클래스.ex01;

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
