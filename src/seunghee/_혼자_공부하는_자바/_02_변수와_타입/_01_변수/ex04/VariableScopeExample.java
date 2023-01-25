package seunghee._혼자_공부하는_자바._02_변수와_타입._01_변수.ex04;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {

			int v2;
			v2 = v1 - 10;
		}

		int v3 = v1 + /* v2 */ + 5; 
	}
}
