package seunghee.study.Do_It_자바_프로그래밍_입문._04_제어_흐름_이해하기._02_반복문;

public class _03_DoWhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}
}
