package seunghee._혼자_공부하는_자바._02_변수와_타입._01_변수.ex03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x : "+x+", y : "+y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : "+x+", y : "+y);
	}
}
