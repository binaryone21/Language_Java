package seunghee.coding.programmers.level_0_5;

/*
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
 * queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 *
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
 *
 * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
 * 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
 */

import java.util.Arrays;

public class _70_수열과_구간_쿼리_2 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {0, 1, 2, 4, 3}, new int[][] {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}));		// 3, 4, -1
	}

	// 연산
	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		for(int i=0; i< queries.length; i++) {
			int min = Integer.MAX_VALUE;
			for(int j=queries[i][0]; j<=queries[i][1]; j++) {
				if(queries[i][2] < arr[j]) {
					min = Math.min(min, arr[j]);
				}
			}
			answer[i] = (min == Integer.MAX_VALUE ? -1 : min);
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
