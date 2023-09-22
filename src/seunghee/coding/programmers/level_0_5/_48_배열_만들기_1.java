package seunghee.coding.programmers.level_0_5;

/*
 * 정수 n과 k가 주어졌을 때,
 * 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을
 * return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _48_배열_만들기_1 {
	// 입력
	public static void main(String[] args) {
		print(solution(10, 3)); 	// [3, 6, 9]
		print(solution(15, 5)); 	// [5, 10, 15]
	}

	// 연산
	public static int[] solution(int n, int k) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=k; i<=n; i+=k) {
			list.add(i);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
