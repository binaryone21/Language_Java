package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._01_인터페이스란.ex01;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}
