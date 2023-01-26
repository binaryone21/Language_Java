package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개.ex03;

public class Outer {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class Inner {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class StaticInner {
		void method() {
			// field1 = 10;
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
