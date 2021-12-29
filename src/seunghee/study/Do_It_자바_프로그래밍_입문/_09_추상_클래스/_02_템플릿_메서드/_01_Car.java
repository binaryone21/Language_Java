package seunghee.study.Do_It_자바_프로그래밍_입문._09_추상_클래스._02_템플릿_메서드;

public abstract class _01_Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
