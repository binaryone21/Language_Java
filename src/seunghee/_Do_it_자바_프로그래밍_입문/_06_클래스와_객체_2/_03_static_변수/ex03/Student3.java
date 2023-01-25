package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._03_static_변수.ex03;

public class Student3 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student3() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
