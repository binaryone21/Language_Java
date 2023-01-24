package seunghee._혼자_공부하는_자바._06_클래스._03_생성자.ex03;

public class Car2 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car2( ) {
		
	}
	
	Car2(String model) {
		this.model = model;
	}
	
	Car2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
