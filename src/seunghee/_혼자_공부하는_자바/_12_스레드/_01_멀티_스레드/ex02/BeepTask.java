package seunghee._혼자_공부하는_자바._12_스레드._01_멀티_스레드.ex02;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}
}
