package seunghee._혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버.ex02;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10* 10* Calculator.pi;
		int result2 = Calculator.plus(10,  5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}
}
