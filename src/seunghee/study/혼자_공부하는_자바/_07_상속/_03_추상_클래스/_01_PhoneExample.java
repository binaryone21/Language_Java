package seunghee.study.혼자_공부하는_자바._07_상속._03_추상_클래스;

public class _01_PhoneExample {
	public static void main(String[] args) {
		/* _01_Phone phone = new _01_Phone(); */
		
		_01_SmartPhone smartPhone = new _01_SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
