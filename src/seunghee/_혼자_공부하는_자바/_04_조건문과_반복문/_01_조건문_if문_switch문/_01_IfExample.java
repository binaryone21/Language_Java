package seunghee._혼자_공부하는_자바._04_조건문과_반복문._01_조건문_if문_switch문;

public class _01_IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}
