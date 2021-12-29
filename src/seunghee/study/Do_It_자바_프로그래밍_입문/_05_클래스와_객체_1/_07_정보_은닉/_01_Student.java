package seunghee.study.Do_It_자바_프로그래밍_입문._05_클래스와_객체_1._07_정보_은닉;

public class _01_Student {
	int studentId;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
