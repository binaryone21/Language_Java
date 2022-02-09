package seunghee._혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성;

public class _01_Car {
	_01_Tire frontLeftTire = new _01_HankookTire();
	_01_Tire frontRightTire = new _01_HankookTire();
	_01_Tire backLeftTire= new _01_HankookTire();
	_01_Tire backRightTire= new _01_HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
