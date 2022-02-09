package seunghee._혼자_공부하는_자바._12_스레드._01_멀티_스레드;

public class _03_BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new _03_BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
