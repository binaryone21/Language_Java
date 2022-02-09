package seunghee._혼자_공부하는_자바._07_상속._01_상속;

public class _03_Computer extends _03_Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
