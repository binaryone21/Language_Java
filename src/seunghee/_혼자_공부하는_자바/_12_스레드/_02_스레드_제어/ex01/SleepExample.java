package seunghee._혼자_공부하는_자바._12_스레드._02_스레드_제어.ex01;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			System.out.println("띵");
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {}
		}
	}
}
