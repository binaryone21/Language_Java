package seunghee.study.혼자_공부하는_자바._06_클래스._04_메소드;

public class _01_CalculatorExample {
	public static void main(String[] args) {
		_01_Calculator myCalc = new _01_Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : "+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		
		myCalc.powerOff();
	}
}
