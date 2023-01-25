package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._03_static_변수.ex04;

public class StudentTest4 {
	public static void main(String[] args) {
		Student4 studentLee = new Student4();
		studentLee.setStudentName("이지원");
		System.out.println(Student4.getSerialNum());
		System.out.println(studentLee.studentName+" 학번 : "+studentLee.studentID);
		
		Student4 studentSon = new Student4();
		studentSon.setStudentName("손수경");
		System.out.println(Student4.getSerialNum());
		System.out.println(studentSon.studentName+" 학번 : "+studentSon.studentID);
	}
}
