package seunghee._혼자_공부하는_자바._06_클래스._03_생성자;

public class _03_Car2 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	_03_Car2( ) {
		
	}
	
	_03_Car2(String model) {
		this.model = model;
	}
	
	_03_Car2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	_03_Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
