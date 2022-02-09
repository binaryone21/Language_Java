package seunghee._혼자_공부하는_자바._06_클래스._04_메소드;

public class _04_Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과 : "+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
