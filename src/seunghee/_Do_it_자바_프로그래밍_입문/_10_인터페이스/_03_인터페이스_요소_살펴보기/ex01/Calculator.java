package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._03_인터페이스_요소_살펴보기.ex01;

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
