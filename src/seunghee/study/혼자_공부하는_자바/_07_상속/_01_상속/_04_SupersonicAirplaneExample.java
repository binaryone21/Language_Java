package seunghee.study.혼자_공부하는_자바._07_상속._01_상속;

public class _04_SupersonicAirplaneExample {
	public static void main(String[] args) {
		_04_SupersonicAirplane sa = new _04_SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = _04_SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = _04_SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
