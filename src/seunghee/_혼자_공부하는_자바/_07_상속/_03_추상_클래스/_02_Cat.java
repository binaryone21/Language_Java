package seunghee._혼자_공부하는_자바._07_상속._03_추상_클래스;

public class _02_Cat extends _02_Animal {
	public _02_Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
