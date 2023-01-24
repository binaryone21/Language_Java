package seunghee._혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버.ex01;

public class Car {
	
	// 필드
	String model;
	int speed;
	
	// 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속 : "+this.speed+"km/h)");
		}
	}
}
