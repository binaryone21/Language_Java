package seunghee._혼자_공부하는_자바._04_조건문과_반복문._01_조건문_if문_switch문;

public class _03_IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}
	}
}
