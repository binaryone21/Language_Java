package seunghee.study.혼자_공부하는_자바._05_참조_타입._02_배열;

public class _04_ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : "+avg);
	}
}
