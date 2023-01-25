package seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.package1;


public class _03_A {
	// 필드
	public int field1;
	int field2;
	private int field3;
	
	// 생성자
	public _03_A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	// 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
}
