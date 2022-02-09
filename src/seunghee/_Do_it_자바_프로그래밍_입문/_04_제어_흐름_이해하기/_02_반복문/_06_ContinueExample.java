package seunghee._Do_it_자바_프로그래밍_입문._04_제어_흐름_이해하기._02_반복문;

public class _06_ContinueExample {
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {
			if(num % 2 == 0) {
				continue;
			}
			total += num;
		}
		
		System.out.println("1부터 100까지의 홀수의 합은 : "+total+"입니다.");
	}
}
