package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기;

public class _02_MyClass implements _02_MyInterface {

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
}
