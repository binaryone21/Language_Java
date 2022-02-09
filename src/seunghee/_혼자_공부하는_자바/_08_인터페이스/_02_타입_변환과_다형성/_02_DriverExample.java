package seunghee._혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성;

public class _02_DriverExample {
	public static void main(String[] args) {
		_02_Driver driver = new _02_Driver();
		
		_02_Bus bus = new _02_Bus();
		_02_Taxi taxi = new _02_Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
