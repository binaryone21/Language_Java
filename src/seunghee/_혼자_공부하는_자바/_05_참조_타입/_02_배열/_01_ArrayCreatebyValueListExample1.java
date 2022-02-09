package seunghee._혼자_공부하는_자바._05_참조_타입._02_배열;

public class _01_ArrayCreatebyValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("sorces[0] : "+scores[0]);
		System.out.println("sorces[1] : "+scores[1]);
		System.out.println("sorces[2] : "+scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);
		double avg = (double) sum /3;
		System.out.println("평균  : "+avg);
		
	}
}