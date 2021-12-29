package seunghee.study.혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._01_중첩_클래스와_중첩_인터페이스_소개;

public class _06_ButtonExample {
	public static void main(String[] args) {
		_06_Button btn = new _06_Button();
		
		btn.setOnClickListener(new _06_CallListener());
		btn.touch();
		
		btn.setOnClickListener(new _06_MessageListener());
		btn.touch();
	}
}
