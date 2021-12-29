package seunghee.study.Do_It_자바_프로그래밍_입문._06_클래스와_객체_2._03_static_변수;

public class _03_StudentTest3 {
	public static void main(String[] args) {
		_02_Student2 studentLee = new _02_Student2();
		studentLee.setStudentName("이지원");
		System.out.println(_02_Student2.serialNum);
		System.out.println(studentLee.studentName+" 학번 : "+studentLee.studentID);
		
		_02_Student2 studentSon = new _02_Student2();
		studentSon.setStudentName("손수경");
		System.out.println(_02_Student2.serialNum);
		System.out.println(studentSon.studentName+" 학번 : "+studentSon.studentID);
	}
}
