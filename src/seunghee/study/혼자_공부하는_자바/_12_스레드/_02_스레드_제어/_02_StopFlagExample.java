package seunghee.study.혼자_공부하는_자바._12_스레드._02_스레드_제어;

public class _02_StopFlagExample {
	public static void main(String[] args) {
		_02_PrintThread printThread = new _02_PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		
		printThread.setStop(true);
	}
}
