package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._03_인터페이스_요소_살펴보기.ex01;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}
}
