package seunghee.study.혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._02_익명_객체;

public class _02_AnonymousExample {
	public static void main(String[] args) {
		_02_Anonymous anony = new _02_Anonymous();
		// 익명 객체 필드 사용
		anony.field.turnOn();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
				new _02_RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("SmartTV를 끕니다.");
					}
				}
			);
	}
}
