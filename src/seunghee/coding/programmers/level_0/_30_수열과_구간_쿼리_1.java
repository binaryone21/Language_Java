package seunghee.coding.programmers.level_0;

/*
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
 * queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
 *
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
 *
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;

public class _30_수열과_구간_쿼리_1 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0, 1},{1, 2},{2, 3}}));
	}

	// 연산
	public static int[] solution(int[] arr, int[][] queries) {
		for(int i=0; i< queries.length; i++) {
			for(int k=queries[i][0]; k<=queries[i][1]; k++) {
				arr[k]++;
			}
		}
		return arr;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
