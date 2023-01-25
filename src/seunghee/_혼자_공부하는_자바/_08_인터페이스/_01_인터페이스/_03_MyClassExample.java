package seunghee._혼자_공부하는_자바._08_인터페이스._01_인터페이스;


public class _03_MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)---------------------");
		
		_03_MyClass myClass1 = new _03_MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)---------------------");
		
		_03_MyClass myClass2 = new _03_MyClass(new _01_Audio());
		
		System.out.println("3)---------------------");
		
		_03_MyClass myClass3 = new _03_MyClass();
		myClass3.methodA();
		
		System.out.println("4)---------------------");
		
		_03_MyClass myClass4 = new _03_MyClass();
		myClass4.methodB(new _01_Television());
	}
}
