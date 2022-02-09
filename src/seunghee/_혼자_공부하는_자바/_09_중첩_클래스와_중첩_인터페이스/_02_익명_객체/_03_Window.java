package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._02_익명_객체;

public class _03_Window {
	_03_Button button1 = new _03_Button();
	_03_Button button2 = new _03_Button();
	
	// 필드 초기값으로 대입
	_03_Button.OnClickListener listener = new _03_Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	_03_Window() {
		button1.setOnClickListener( listener );
		button2.setOnClickListener(
					new _03_Button.OnClickListener() {
						
						@Override
						public void onClick() {
							System.out.println("메시지를 보냅니다.");
						}
					}
				);
	}
}
