package seunghee._혼자_공부하는_자바._06_클래스._03_생성자;

public class _02_KoreanExample {
	public static void main(String[] args) {
		_02_Korean k1 = new _02_Korean("박자바", "011225-1234567");
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn : "+k1.ssn);
		
		_02_Korean k2 = new _02_Korean("김자바", "930525-0654321");
		System.out.println("k2.name : "+k2.name);
		System.out.println("k2.ssn : "+k2.ssn);
	}
}
