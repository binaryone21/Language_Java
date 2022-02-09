package seunghee._혼자_공부하는_자바._12_스레드._02_스레드_제어;

public class _03_PrintThread extends Thread {
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
