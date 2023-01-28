package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._03_템플릿_메서드_응용하기.ex01;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 고급자 레벨입니다. ***");
	}
}
