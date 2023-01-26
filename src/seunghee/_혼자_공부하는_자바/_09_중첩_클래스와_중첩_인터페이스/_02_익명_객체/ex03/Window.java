package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._02_익명_객체.ex03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		button1.setOnClickListener( listener );
		button2.setOnClickListener(
					new Button.OnClickListener() {
						
						@Override
						public void onClick() {
							System.out.println("메시지를 보냅니다.");
						}
					}
				);
	}
}
