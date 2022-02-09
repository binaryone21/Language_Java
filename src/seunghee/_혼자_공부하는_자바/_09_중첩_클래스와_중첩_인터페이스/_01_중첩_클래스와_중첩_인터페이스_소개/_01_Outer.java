package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개;

@SuppressWarnings("unused")
public class _01_Outer {
	_01_Outer() { System.out.println("Outer 객체가 생성됨"); }
	
	// 인스턴스 멤버 클래스
	class Inner {
		Inner() { System.out.println("Inner 객체가 생성됨"); }
		int iFiled;
		void iMethod() {}
		// static int sFiled;
		// static void sMethod() {}
	}
	
	// 정적 멤버 클래스
	static class StaticInner {
		StaticInner() { System.out.println("static 객체가 생성됨"); }
		int siField;
		void siMethod() {}
		static int ssFiled;
		static void ssMethod() {}
	}
	
	void method() {
		// 로컬 클래스
		class LocalInner {
			LocalInner() { System.out.println("local 객체가 생성됨"); }
			int liField;
			void liMethod() {}
			// static int sFiled;
			// static void sMethod() {}
		}
		LocalInner li = new LocalInner();
		li.liField = 3;
		li.liMethod();
	}
}
