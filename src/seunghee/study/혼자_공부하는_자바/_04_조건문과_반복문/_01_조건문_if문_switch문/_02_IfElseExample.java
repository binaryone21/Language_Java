package seunghee.study.혼자_공부하는_자바._04_조건문과_반복문._01_조건문_if문_switch문;

public class _02_IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}
