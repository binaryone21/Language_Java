package seunghee.study.혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버;

public class _03_Car {
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	
	public static void main(String[] args) {
		_03_Car myCar = new _03_Car();
		myCar.speed = 60;
		myCar.run();
	}
}
