package seunghee.study.혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개;

public class _05_Outer {
	String field = "Outter-field";
	void method() {
		System.out.println("Ouuter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(_05_Outer.this.field);
			_05_Outer.this.method();
		}
	}
}
