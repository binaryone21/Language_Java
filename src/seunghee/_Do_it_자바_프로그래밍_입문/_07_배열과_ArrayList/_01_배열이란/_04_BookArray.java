package seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란;

public class _04_BookArray {
	public static void main(String[] args) {
		_04_Book[] library = new _04_Book[5];
		
		library[0] = new _04_Book("태백산맥", "조정래");
		library[1] = new _04_Book("데미안", "헤르만 헤세");
		library[2] = new _04_Book("어떻게 살 것인가", "유시민");
		library[3] = new _04_Book("토지", "박경리");
		library[4] = new _04_Book("어린완자", "생텍쥐페리");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
