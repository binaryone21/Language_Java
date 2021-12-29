package seunghee.study.Do_It_자바_프로그래밍_입문._06_클래스와_객체_2._03_static_변수;

public class _04_Student4 {
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public _04_Student4() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		_04_Student4.serialNum = serialNum;
	}
}
