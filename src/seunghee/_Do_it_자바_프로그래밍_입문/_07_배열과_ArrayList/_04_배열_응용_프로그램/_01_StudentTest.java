package seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._04_배열_응용_프로그램;

public class _01_StudentTest {
	public static void main(String[] args) {
		_01_Student studentLee = new _01_Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		_01_Student studentKim = new _01_Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("===============================");
		studentKim.showStudentInfo();
	}
}
