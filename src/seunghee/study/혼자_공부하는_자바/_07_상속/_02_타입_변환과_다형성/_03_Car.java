package seunghee.study.혼자_공부하는_자바._07_상속._02_타입_변환과_다형성;

public class _03_Car {
	// 필드
	_03_Tire frontLeftTire = new _03_Tire("앞왼쪽", 6);
	_03_Tire frontRightTire = new _03_Tire("앞오른쪽", 2);
	_03_Tire backLeftTire = new _03_Tire("뒤왼쪽", 3);
	_03_Tire backRightTire = new _03_Tire("뒤오른쪽", 4);
	
	// 생성자
	
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLeftTire.roll()==false) { stop(); return 3; }
		if(backRightTire.roll()==false) { stop(); return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
