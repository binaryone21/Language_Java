package seunghee.study.Do_It_자바_프로그래밍_입문._05_클래스와_객체_1._02_클래스_살펴보기;

public class _02_Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);	// 이름, 주소 출력
	}
}
