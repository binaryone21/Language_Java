package seunghee._혼자_공부하는_자바._12_스레드._02_스레드_제어.ex03;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try { Thread.sleep(1000); } catch(InterruptedException e) { }
		
		thread.interrupt();
	}
}
