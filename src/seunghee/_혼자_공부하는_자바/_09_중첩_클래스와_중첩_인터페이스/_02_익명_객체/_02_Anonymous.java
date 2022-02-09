package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._02_익명_객체;

public class _02_Anonymous {
	// 필드 초기값으로 대입
	_02_RemoteControl field = new _02_RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입
		_02_RemoteControl localVar = new _02_RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
				
		};
		
		localVar.turnOn();
	}
	
	void method2(_02_RemoteControl rc) {
		rc.turnOff();
	}
}
