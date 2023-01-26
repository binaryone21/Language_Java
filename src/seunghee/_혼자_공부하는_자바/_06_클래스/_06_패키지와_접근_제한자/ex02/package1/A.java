package seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex02.package1;

public class A {
	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자
	public A(boolean b) {}
	A(int i) {}
	private A(String s) {}
}
