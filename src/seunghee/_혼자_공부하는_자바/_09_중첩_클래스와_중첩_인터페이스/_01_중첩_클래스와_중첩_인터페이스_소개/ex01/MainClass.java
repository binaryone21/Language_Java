package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개.ex01;

public class MainClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		
		// 인스턴스 멤버 클래스 객체 생성
		Outer.Inner i = o.new Inner();
		i.iFiled = 3;
		i.iMethod();
		
		// 정적 멤버 클래스 객체 생성
		Outer.StaticInner si = new Outer.StaticInner();
		si.siField = 3;
		si.siMethod();
		Outer.StaticInner.ssFiled = 3;
		Outer.StaticInner.ssMethod();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		o.method();
	}
}
