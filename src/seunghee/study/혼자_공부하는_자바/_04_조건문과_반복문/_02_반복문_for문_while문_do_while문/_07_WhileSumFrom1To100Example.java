package seunghee.study.혼자_공부하는_자바._04_조건문과_반복문._02_반복문_for문_while문_do_while문;

public class _07_WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" +(i-1)+ " 합 : " +sum);
	}
}
