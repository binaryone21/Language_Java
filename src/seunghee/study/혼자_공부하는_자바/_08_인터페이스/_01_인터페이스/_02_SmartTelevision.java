package seunghee.study.혼자_공부하는_자바._08_인터페이스._01_인터페이스;

public class _02_SmartTelevision implements _01_RemoteControl, _02_Searchable {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME){
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
}
