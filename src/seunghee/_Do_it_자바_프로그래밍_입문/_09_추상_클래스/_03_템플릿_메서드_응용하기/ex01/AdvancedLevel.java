package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._03_템플릿_메서드_응용하기.ex01;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 Jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모르지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 중급자 레벨입니다. ***");
	}
}
