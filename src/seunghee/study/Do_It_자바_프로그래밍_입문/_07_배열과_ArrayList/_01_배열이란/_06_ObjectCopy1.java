package seunghee.study.Do_It_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란;

public class _06_ObjectCopy1 {
	public static void main(String[] args) {
		_04_Book[] bookArray1 = new _04_Book[3];
		_04_Book[] bookArray2 = new _04_Book[3];
		
		bookArray1[0] = new _04_Book("태백산맥", "조정래");
		bookArray1[1] = new _04_Book("데미안", "헤르만 헤세");
		bookArray1[2] = new _04_Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); 
		}
	}
}
