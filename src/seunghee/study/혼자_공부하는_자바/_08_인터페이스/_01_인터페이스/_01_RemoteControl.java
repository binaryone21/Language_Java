package seunghee.study.혼자_공부하는_자바._08_인터페이스._01_인터페이스;

public interface _01_RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
