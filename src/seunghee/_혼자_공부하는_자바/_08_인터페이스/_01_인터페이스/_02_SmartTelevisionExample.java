package seunghee._혼자_공부하는_자바._08_인터페이스._01_인터페이스;

@SuppressWarnings("unused")
public class _02_SmartTelevisionExample {
	public static void main(String[] args) {
		_02_SmartTelevision tv = new _02_SmartTelevision();
		
		_01_RemoteControl rc = tv;
		_02_Searchable searchable = tv;
	}
}
