package seunghee._혼자_공부하는_자바._07_상속._02_타입_변환과_다형성.ex05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		parent.field2 = "data2";
		parent.method3();
		*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}
}
