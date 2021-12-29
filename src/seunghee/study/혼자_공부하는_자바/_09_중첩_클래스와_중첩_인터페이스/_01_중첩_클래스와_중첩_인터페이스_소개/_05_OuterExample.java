package seunghee.study.혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개;

public class _05_OuterExample {
	public static void main(String[] args) {
		_05_Outer outer = new _05_Outer();
		_05_Outer.Nested nested = outer.new Nested();
		nested.print();
	}
}
