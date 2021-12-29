package seunghee.study.Do_It_자바_프로그래밍_입문._05_클래스와_객체_1._03_메서드;

public class _01_FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1+" + "+num2+" = "+sum+"입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
