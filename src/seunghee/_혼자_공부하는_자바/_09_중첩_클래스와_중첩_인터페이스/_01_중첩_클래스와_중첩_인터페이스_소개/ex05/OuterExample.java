package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개.ex05;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Nested nested = outer.new Nested();
		nested.print();
	}
}
