package seunghee._혼자_공부하는_자바._12_스레드._01_멀티_스레드.ex02;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for( int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}
}
