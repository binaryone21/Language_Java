package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._03_static_변수.ex01;

public class Student1 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
