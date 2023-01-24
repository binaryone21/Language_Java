package seunghee._혼자_공부하는_자바._04_조건문과_반복문._02_반복문_for문_while문_do_while문.ex02;

public class ForSumFrom1To10Example {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : "+sum);
	}
}
