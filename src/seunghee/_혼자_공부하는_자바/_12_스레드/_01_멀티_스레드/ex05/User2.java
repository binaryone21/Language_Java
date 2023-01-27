package seunghee._혼자_공부하는_자바._12_스레드._01_멀티_스레드.ex05;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
