package seunghee.study.혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성;

public class _03_VehicleExample {
	public static void main(String[] args) {
		_03_Vehicle vehicle = new _03_Bus();
		
		vehicle.run();
		// vehicle.checkFare();
		
		_03_Bus bus = (_03_Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
