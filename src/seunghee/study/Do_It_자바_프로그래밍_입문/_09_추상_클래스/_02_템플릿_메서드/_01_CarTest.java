package seunghee.study.Do_It_자바_프로그래밍_입문._09_추상_클래스._02_템플릿_메서드;

public class _01_CarTest {
	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		_01_Car myCar = new _01_AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		_01_Car hisCar = new _01_ManualCar();
		hisCar.run();
	}
}
