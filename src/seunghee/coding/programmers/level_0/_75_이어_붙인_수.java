package seunghee.coding.programmers.level_0;

/*
 * 정수가 담긴 리스트 num_list가 주어집니다.
 * num_list의 홀수만 순서대로 이어 붙인 수와
 * 짝수만 순서대로 이어 붙인 수의
 * 합을 return하도록 solution 함수를 완성해주세요.

 */

import java.util.Arrays;

public class _75_이어_붙인_수 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {3, 4, 5, 2, 1}));			// 393
		print(solution(new int[] {5, 7, 8, 3}));			// 581
	}

	// 연산
	public static int solution(int[] num_list) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int num : num_list) {
			((num%2 == 1) ? sb1 : sb2).append(num);
		}
		return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
