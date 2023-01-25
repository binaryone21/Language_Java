package seunghee._혼자_공부하는_자바._07_상속._02_타입_변환과_다형성;


public class _06_InstanceofExample {
	public static void method1(_06_Parent parent) {
		if(parent instanceof _06_Child) {
			_06_Child child = (_06_Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(_06_Parent parent) {
		_06_Child child = (_06_Child) parent;
		System.out.println("method2 - Chidl로 변환 성공");
	}
	
	public static void main(String[] args) {
		_06_Parent parentA = new _06_Child();
		method1(parentA);
		method2(parentA);
		
		_06_Parent parentB = new _06_Parent();
		method1(parentB);
		method2(parentB);
	}
}
