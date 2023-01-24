package seunghee._혼자_공부하는_자바._06_클래스._03_생성자.ex02;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
