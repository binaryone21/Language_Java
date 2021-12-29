package seunghee.study.Do_It_자바_프로그래밍_입문._09_추상_클래스._01_추상_클래스;

public class _01_DeskTop extends _01_Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
}
