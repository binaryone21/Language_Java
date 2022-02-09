package seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자;

public class _04_Car {
	// 필드
	private int speed;
	private boolean stop;
	
	// 생성자
	
	// 메소드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
