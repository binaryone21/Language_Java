package seunghee._혼자_공부하는_자바._07_상속._03_추상_클래스.ex02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
