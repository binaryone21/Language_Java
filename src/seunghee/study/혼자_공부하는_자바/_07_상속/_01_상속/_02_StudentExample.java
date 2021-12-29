package seunghee.study.혼자_공부하는_자바._07_상속._01_상속;

public class _02_StudentExample {
	public static void main(String[] args) {
		_02_Student student = new _02_Student("홍길동", "123456-1234567", 1);
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : "+student.studentNo);
	}
}
