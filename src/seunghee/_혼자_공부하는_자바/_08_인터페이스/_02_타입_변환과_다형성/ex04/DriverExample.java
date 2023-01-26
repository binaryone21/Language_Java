package seunghee._혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성.ex04;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
