package seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.package1;

public class _02_A {
	// 필드
	_02_A a1 = new _02_A(true);
	_02_A a2 = new _02_A(1);
	_02_A a3 = new _02_A("문자열");
	
	// 생성자
	public _02_A(boolean b) {}
	_02_A(int i) {}
	private _02_A(String s) {}
}
