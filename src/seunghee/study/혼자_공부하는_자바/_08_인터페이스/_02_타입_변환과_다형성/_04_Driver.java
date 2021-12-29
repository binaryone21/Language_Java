package seunghee.study.혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성;

public class _04_Driver {
	public void drive(_04_Vehicle vehicle) {
		if(vehicle instanceof _04_Bus) {
			_04_Bus bus = (_04_Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
