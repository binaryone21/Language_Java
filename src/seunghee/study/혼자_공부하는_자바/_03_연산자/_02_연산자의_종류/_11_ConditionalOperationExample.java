package seunghee.study.혼자_공부하는_자바._03_연산자._02_연산자의_종류;

public class _11_ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score+"점은 "+grade+"등급입니다.");
	}
}
