package seunghee._혼자_공부하는_자바._07_상속._03_추상_클래스.ex01;

public class PhoneExample {
	public static void main(String[] args) {
		/* Phone phone = new Phone(); */
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
