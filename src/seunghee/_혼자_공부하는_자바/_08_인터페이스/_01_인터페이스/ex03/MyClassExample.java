package seunghee._혼자_공부하는_자바._08_인터페이스._01_인터페이스.ex03;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)---------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)---------------------");
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)---------------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)---------------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
