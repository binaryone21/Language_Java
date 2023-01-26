package seunghee._혼자_공부하는_자바._08_인터페이스._01_인터페이스.ex02;

@SuppressWarnings("unused")
public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
