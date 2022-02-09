package seunghee._혼자_공부하는_자바._04_조건문과_반복문._02_반복문_for문_while문_do_while문;

public class _03_ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~"+(i-1)+" 합 : "+sum);
	}
}
