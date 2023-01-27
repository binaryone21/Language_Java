package seunghee._혼자_공부하는_자바._12_스레드._01_멀티_스레드.ex03;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
