package seunghee._혼자_공부하는_자바._12_스레드._01_멀티_스레드;

public class _05_MainThreadExample {
	public static void main(String[] args) {
		_05_Calculator calculator = new _05_Calculator();
		
		_05_User1 user1 = new _05_User1();
		user1.setCalculator(calculator);
		user1.start();
		
		_05_User2 user2 = new _05_User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
