package seunghee._혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성.ex04;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
