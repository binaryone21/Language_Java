package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._03_static_변수;

@SuppressWarnings("static-access")
public class _01_StudentTest1 {
	public static void main(String[] args) {
		_01_Student1 studentLee = new _01_Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		_01_Student1 studentSon = new _01_Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
