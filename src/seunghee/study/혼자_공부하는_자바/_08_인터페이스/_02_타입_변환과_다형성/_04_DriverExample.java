package seunghee.study.혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성;

public class _04_DriverExample {
	public static void main(String[] args) {
		_04_Driver driver = new _04_Driver();
		
		_04_Bus bus = new _04_Bus();
		_04_Taxi taxi = new _04_Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
