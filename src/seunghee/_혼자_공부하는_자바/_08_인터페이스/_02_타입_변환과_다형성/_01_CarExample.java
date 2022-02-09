package seunghee._혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성;

public class _01_CarExample {
	public static void main(String[] args) {
		_01_Car myCar = new _01_Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new _01_KumhoTire();
		myCar.frontRightTire = new _01_KumhoTire();
		
		myCar.run();
	}
}
