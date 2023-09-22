package seunghee.coding.programmers.level_0_5;

/*
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
 * queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
 *
 * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
 *
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;

public class _71_수열과_구간_쿼리_3 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0, 3}, {1, 2}, {1, 4}}));		// 3, 4, 1, 0, 2
	}

	// 연산
	public static int[] solution(int[] arr, int[][] queries) {
		for(int i=0; i< queries.length; i++) {
			int temp = arr[queries[i][0]];
			arr[queries[i][0]] = arr[queries[i][1]];
			arr[queries[i][1]] = temp;
		}
		return arr;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
