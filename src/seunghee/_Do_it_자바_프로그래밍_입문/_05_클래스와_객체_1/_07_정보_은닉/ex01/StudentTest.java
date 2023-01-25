package seunghee._Do_it_자바_프로그래밍_입문._05_클래스와_객체_1._07_정보_은닉.ex01;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "이상원";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
