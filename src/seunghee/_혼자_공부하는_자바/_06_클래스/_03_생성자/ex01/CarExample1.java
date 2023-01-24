package seunghee._혼자_공부하는_자바._06_클래스._03_생성자.ex01;

@SuppressWarnings("unused")
public class CarExample1 {
	public static void main(String[] args) {
		Car1 myCar1 = new Car1("검정", 3000);
		/* Car1 myCar2 = new Car1(); */	// 기본 생성자를 호출할 수 없음
	}
}
