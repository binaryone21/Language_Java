package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._03_템플릿_메서드_응용하기;

public abstract class _01_PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}
