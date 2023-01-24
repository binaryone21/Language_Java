package seunghee._혼자_공부하는_자바._06_클래스._04_메소드.ex05;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : "+speed+"km/h");
	}
}
