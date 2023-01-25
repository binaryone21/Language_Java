package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개;


public class _02_Outer {
	// 인스턴스 필드
	Inner i1 = new Inner();
	StaticInner si1 = new StaticInner();
	
	// 인스턴스 메소드
	void method1() {
		Inner i2 = new Inner();
		StaticInner si2 = new StaticInner();
	}
	
	// 정적 필드 초기화
	// static Inner i3 = new Inner();
	static StaticInner si3 = new StaticInner();
	
	// 정적 메소드
	static void method2() {
		// Inner i4 = new Inner();
		StaticInner si4 = new StaticInner();
	}
	
	
	
	// 인스턴스 멤버 클래스
	class Inner {}
	
	// 정적 멤버 클래스
	static class StaticInner {}
}
