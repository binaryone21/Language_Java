package seunghee._Do_it_자바_프로그래밍_입문._05_클래스와_객체_1._04_클래스와_인스턴스.ex03;

public class Student {
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
