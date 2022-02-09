package seunghee._혼자_공부하는_자바._06_클래스._01_객체_지향_프로그래밍;

@SuppressWarnings("unused")
public class _01_StudentExample {
	public static void main(String[] args) {
		_01_Student s1 = new _01_Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		_01_Student s2 = new _01_Student();
		System.out.println("s2 변수가 또 다른  Student 객체를 참조합니다.");
	}
}
