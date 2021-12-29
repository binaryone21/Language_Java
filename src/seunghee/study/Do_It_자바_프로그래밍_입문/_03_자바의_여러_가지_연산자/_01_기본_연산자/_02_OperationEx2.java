package seunghee.study.Do_It_자바_프로그래밍_입문._03_자바의_여러_가지_연산자._01_기본_연산자;

public class _02_OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150;			// 게임에서 획득한 점수는 150점
		
		int lastScore1 = ++gameScore;	// gameScore에서 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1);	// 151
		
		int lastScore2 = --gameScore;	// gameScore에서 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);	// 150
	}
}
