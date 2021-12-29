package seunghee.study.혼자_공부하는_자바._06_클래스._02_필드;

public class _01_CarExample {
	public static void main(String[] args) {
		
		// 객체 생성
		_01_Car myCar = new _01_Car();
		
		// 필드값 읽기
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색깔 : "+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+myCar.speed);
	}
}
