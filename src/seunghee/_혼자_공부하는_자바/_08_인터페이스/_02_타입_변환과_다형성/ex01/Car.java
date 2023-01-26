package seunghee._혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성.ex01;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire= new HankookTire();
	Tire backRightTire= new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
