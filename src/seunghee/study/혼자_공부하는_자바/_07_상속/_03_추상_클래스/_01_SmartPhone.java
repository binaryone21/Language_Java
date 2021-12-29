package seunghee.study.혼자_공부하는_자바._07_상속._03_추상_클래스;

public class _01_SmartPhone extends _01_Phone {
	
	// 생성자
	public _01_SmartPhone(String owner) {
		super(owner);
	}
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
