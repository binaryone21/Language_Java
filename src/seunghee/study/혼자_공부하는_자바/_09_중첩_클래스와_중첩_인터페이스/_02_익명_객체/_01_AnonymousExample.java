package seunghee.study.혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._02_익명_객체;

public class _01_AnonymousExample {
	public static void main(String[] args) {
		_01_Anonymous anony = new _01_Anonymous();
		
		// 익명 객체 필드 사용
		anony.filed.wake();
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 익명 객체 매개값 사용
		anony.method2(
			new _01_Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어났습니다.");
					study();
				}
			}
		);
	}
}