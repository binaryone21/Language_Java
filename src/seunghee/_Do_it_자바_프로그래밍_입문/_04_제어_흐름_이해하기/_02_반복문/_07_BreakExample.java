package seunghee._Do_it_자바_프로그래밍_입문._04_제어_흐름_이해하기._02_반복문;

public class _07_BreakExample {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num=0; ; num++) {
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("num : "+num);
		System.out.println("sum : "+sum);
	}
}
