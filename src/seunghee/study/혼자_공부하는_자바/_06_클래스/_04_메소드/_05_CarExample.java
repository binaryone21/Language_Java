package seunghee.study.혼자_공부하는_자바._06_클래스._04_메소드;

public class _05_CarExample {
	public static void main(String[] args) {
		_05_Car myCar = new _05_Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : "+speed+"km/h");
	}
}
