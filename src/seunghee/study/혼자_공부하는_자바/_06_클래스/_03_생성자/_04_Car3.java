package seunghee.study.혼자_공부하는_자바._06_클래스._03_생성자;

public class _04_Car3 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	_04_Car3( ) {
		
	}
	
	_04_Car3(String model) {
		this(model, "은색", 250);
	}
	
	_04_Car3(String model, String color) {
		this(model, color, 250);
	}
	
	_04_Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
