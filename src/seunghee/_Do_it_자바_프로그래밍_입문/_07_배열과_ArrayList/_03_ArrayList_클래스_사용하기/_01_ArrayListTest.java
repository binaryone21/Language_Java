package seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._03_ArrayList_클래스_사용하기;

import java.util.ArrayList;

public class _01_ArrayListTest {
	public static void main(String[] args) {
		ArrayList<_01_Book> library = new ArrayList<_01_Book>();
		
		library.add(new _01_Book("태백산맥", "조정래"));
		library.add(new _01_Book("데미안", "헤르만 헤세"));
		library.add(new _01_Book("어떻게 살 것인가", "유시민"));
		library.add(new _01_Book("토지", "박경리"));
		library.add(new _01_Book("어린왕자", "생텍쥐페리"));
		
		for(int i=0; i<library.size(); i++) {
			_01_Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for(_01_Book book : library) {
			book.showBookInfo();
		}
	}
}
