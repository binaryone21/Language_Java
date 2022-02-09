package seunghee._Do_it_자바_프로그래밍_입문._04_제어_흐름_이해하기._02_반복문;

public class _04_ForExample {
	public static void main(String[] args) {
		int i;
		int sum;
		for(i=1, sum=0; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}
}
