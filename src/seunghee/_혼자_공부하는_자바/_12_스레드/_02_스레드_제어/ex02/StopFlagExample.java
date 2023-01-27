package seunghee._혼자_공부하는_자바._12_스레드._02_스레드_제어.ex02;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		
		printThread.setStop(true);
	}
}
