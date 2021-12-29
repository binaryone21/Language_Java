package seunghee.study.혼자_공부하는_자바._07_상속._02_타입_변환과_다형성;

public class _02_ChildExample {
	public static void main(String[] args) {
		_02_Child child = new _02_Child();
		
		_02_Parent parent = child;
		parent.method1();
		parent.method2();
		// parent.method3();
	}
}
