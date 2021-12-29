package seunghee.study.Do_It_자바_프로그래밍_입문._05_클래스와_객체_1._07_정보_은닉;

public class _01_StudentTest {
	public static void main(String[] args) {
		_01_Student studentLee = new _01_Student();
		// studentLee.studentName = "이상원";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
