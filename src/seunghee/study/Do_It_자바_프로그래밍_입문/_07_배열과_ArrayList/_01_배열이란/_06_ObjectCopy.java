package seunghee.study.Do_It_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란;

public class _06_ObjectCopy {
	public static void main(String[] args) {
		_04_Book[] bookArray1 = new _04_Book[3];
		_04_Book[] bookArray2 = new _04_Book[3];
		
		bookArray1[0] = new _04_Book("태백산맥", "조정래");
		bookArray1[1] = new _04_Book("데미안", "헤르만 헤세");
		bookArray1[2] = new _04_Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new _04_Book();
		bookArray2[1] = new _04_Book();
		bookArray2[2] = new _04_Book();
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray1 ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
