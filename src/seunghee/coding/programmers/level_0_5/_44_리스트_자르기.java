package seunghee.coding.programmers.level_0_5;

/*
 * 정수 n과 정수 3개가 담긴 리스트 slicer
 * 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
 * slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
 *
 * n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
 * n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
 * n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
 * n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
 * 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _44_리스트_자르기 {
	// 입력
	public static void main(String[] args) {
		print(solution(1, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})); // [2, 3, 4, 5, 6]
		print(solution(2, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})); // [2, 3, 4, 5, 6]
		print(solution(3, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})); // [2, 3, 4, 5, 6]
		print(solution(4, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})); // [2, 4, 6]
	}

	// 연산
	public static int[] solution(int n, int[] slicer, int[] num_list) {
		int start = slicer[0];
		int end = slicer[1];
		int plus = 1;
		switch(n) {
			case 1 : start = 0; break;
			case 2 : end = num_list.length-1; break;
			case 4 : plus = slicer[2];
		}
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=start; i<=end; i+=plus) {
			list.add(num_list[i]);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
