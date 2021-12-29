package seunghee.study.혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개;

public class _01_MainClass {
	public static void main(String[] args) {
		_01_Outer o = new _01_Outer();
		
		// 인스턴스 멤버 클래스 객체 생성
		_01_Outer.Inner i = o.new Inner();
		i.iFiled = 3;
		i.iMethod();
		
		// 정적 멤버 클래스 객체 생성
		_01_Outer.StaticInner si = new _01_Outer.StaticInner();
		si.siField = 3;
		si.siMethod();
		_01_Outer.StaticInner.ssFiled = 3;
		_01_Outer.StaticInner.ssMethod();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		o.method();
	}
}
