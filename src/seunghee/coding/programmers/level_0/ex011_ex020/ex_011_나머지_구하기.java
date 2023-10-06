package seunghee.coding.programmers.level_0.ex011_ex020;

import java.util.Arrays;

/*
 * 정수 num1, num2가 매개변수로 주어질 때,
 * num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
 */
public class ex_011_나머지_구하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(3, 2));		// 1
		print(solution(10, 5));		// 0
	}

	// 연산
	public static int solution(int num1, int num2) {
		return num1 % num2;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
