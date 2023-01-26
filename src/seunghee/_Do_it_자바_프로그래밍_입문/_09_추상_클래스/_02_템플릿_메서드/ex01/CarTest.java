package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._02_템플릿_메서드.ex01;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}
}
