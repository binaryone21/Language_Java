package seunghee.study.혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개;

@SuppressWarnings("unused")
public class _04_Outer {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;
		// localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) {
		final int localVariable = 1;
		// arg = 100;
		// localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}