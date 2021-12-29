package seunghee.study.Do_It_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기;

public class _02_MyClassTest {
	public static void main(String[] args) {
		_02_MyClass mClass = new _02_MyClass();
		_02_X xClass = mClass;
		xClass.x();
		
		_02_Y yClass = mClass;
		yClass.y();
		
		_02_MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}
