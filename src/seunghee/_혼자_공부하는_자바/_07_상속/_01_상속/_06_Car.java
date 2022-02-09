package seunghee._혼자_공부하는_자바._07_상속._01_상속;

public class _06_Car {
	// 필드
	public int speed;
	
	// 메소드
	public void speedUp() {
		speed += 1;
	}
	
	// final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
