package seunghee.study.혼자_공부하는_자바._08_인터페이스._01_인터페이스;

public class _03_MyClass {
	// 필드
	_01_RemoteControl rc = new _01_Television();
	
	// 생성자
	_03_MyClass() {
		
	}
	
	_03_MyClass(_01_RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메소드
	void methodA() {
		_01_RemoteControl rc = new _01_Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(_01_RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
