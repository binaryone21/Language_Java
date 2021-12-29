package seunghee.study.혼자_공부하는_자바._05_참조_타입._02_배열;

public class _09_AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = "+sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = "+avg);
	}
}
