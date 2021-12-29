package seunghee.study.혼자_공부하는_자바._06_클래스._04_메소드;

public class _06_CalculatorExample {
	public static void main(String[] args) {
		_06_Calculator myCalcu = new _06_Calculator();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// 결과 출력
		System.out.println("정사각형의 넓이 = "+result1);
		System.out.println("직사각형의 넓이 = "+result2);
	}
}
