package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._01_추상_클래스.ex01;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
