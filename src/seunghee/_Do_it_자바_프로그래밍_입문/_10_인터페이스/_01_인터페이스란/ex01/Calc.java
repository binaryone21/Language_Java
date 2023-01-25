package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._01_인터페이스란.ex01;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
