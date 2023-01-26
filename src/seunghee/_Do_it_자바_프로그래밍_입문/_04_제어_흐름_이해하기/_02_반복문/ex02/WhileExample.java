package seunghee._Do_it_자바_프로그래밍_입문._04_제어_흐름_이해하기._02_반복문.ex02;

public class WhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
		
	}
}
