package seunghee._혼자_공부하는_자바._08_인터페이스._01_인터페이스;

public class _01_Television implements _01_RemoteControl {
	// 필드
	private int volume;
	
	// turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	// turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}
}
