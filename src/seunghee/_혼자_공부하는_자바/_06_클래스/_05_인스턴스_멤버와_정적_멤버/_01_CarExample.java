package seunghee._혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버;

public class _01_CarExample {
	public static void main(String[] args) {
		_01_Car myCar = new _01_Car("포르쉐");
		_01_Car yourCar = new _01_Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}
