package seunghee.study.혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _02_Key {
	public int number;
	
	public _02_Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _02_Key) {
			_02_Key compareKey = (_02_Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
}
