package seunghee._혼자_공부하는_자바._07_상속._03_추상_클래스;

public abstract class _01_Phone {
	// 필드
	public String owner;
	
	// 생성자
	public _01_Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
