package seunghee.study.Do_It_자바_프로그래밍_입문._06_클래스와_객체_2._03_static_변수;

public class _04_StudentTest4 {
	public static void main(String[] args) {
		_04_Student4 studentLee = new _04_Student4();
		studentLee.setStudentName("이지원");
		System.out.println(_04_Student4.getSerialNum());
		System.out.println(studentLee.studentName+" 학번 : "+studentLee.studentID);
		
		_04_Student4 studentSon = new _04_Student4();
		studentSon.setStudentName("손수경");
		System.out.println(_04_Student4.getSerialNum());
		System.out.println(studentSon.studentName+" 학번 : "+studentSon.studentID);
	}

}
