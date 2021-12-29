package seunghee.study.혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버;

public class _02_CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10* 10* _02_Calculator.pi;
		int result2 = _02_Calculator.plus(10,  5);
		int result3 = _02_Calculator.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}
}
