package seunghee.study.혼자_공부하는_자바._12_스레드._01_멀티_스레드;

public class _05_User1 extends Thread {
	private _05_Calculator calculator;
	
	public void setCalculator(_05_Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
