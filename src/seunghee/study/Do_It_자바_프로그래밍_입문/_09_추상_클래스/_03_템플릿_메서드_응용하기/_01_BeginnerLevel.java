package seunghee.study.Do_It_자바_프로그래밍_입문._09_추상_클래스._03_템플릿_메서드_응용하기;

public class _01_BeginnerLevel extends _01_PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump할 줄 모르지롱");
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모르지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 초보자 레벨입니다. ***");
	}
}
