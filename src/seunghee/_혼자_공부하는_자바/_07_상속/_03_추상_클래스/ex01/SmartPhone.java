package seunghee._혼자_공부하는_자바._07_상속._03_추상_클래스.ex01;

public class SmartPhone extends Phone {
	
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
