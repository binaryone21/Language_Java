package seunghee.study.Do_It_자바_프로그래밍_입문._05_클래스와_객체_1._04_클래스와_인스턴스;

public class _01_Student {
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		_01_Student studentAhn = new _01_Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
