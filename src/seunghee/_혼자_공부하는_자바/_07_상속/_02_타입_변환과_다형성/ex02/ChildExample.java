package seunghee._혼자_공부하는_자바._07_상속._02_타입_변환과_다형성.ex02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		// parent.method3();
	}
}
