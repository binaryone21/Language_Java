package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._03_static_변수.ex03;

public class StudentTest3 {
	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(Student3.serialNum);
		System.out.println(studentLee.studentName+" 학번 : "+studentLee.studentID);

		Student3 studentSon = new Student3();
		studentSon.setStudentName("손수경");
		System.out.println(Student3.serialNum);
		System.out.println(studentSon.studentName+" 학번 : "+studentSon.studentID);
	}
}
