package seunghee._혼자_공부하는_자바._12_스레드._01_멀티_스레드.ex05;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) { }
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
