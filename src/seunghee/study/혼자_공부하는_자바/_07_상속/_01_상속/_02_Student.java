package seunghee.study.혼자_공부하는_자바._07_상속._01_상속;

public class _02_Student extends _02_People {
	public int studentNo;
	
	public _02_Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
