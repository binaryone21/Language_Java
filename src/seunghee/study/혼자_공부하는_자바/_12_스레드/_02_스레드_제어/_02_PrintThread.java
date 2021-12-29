package seunghee.study.혼자_공부하는_자바._12_스레드._02_스레드_제어;

public class _02_PrintThread extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("자원 종료");
		System.out.println("실행 종료");
	}
}
