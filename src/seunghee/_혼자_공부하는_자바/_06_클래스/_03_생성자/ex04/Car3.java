package seunghee._혼자_공부하는_자바._06_클래스._03_생성자.ex04;

public class Car3 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car3( ) {
		
	}
	
	Car3(String model) {
		this(model, "은색", 250);
	}
	
	Car3(String model, String color) {
		this(model, color, 250);
	}
	
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
