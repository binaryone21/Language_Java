package seunghee._Do_it_자바_프로그래밍_입문._04_제어_흐름_이해하기._02_반복문.ex05;

public class NestedLoop {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				System.out.println(dan+" X "+times+" = "+dan*times);
			}
			System.out.println();
		}
	}
}
