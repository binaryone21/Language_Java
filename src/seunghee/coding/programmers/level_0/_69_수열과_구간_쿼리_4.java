package seunghee.coding.programmers.level_0;

/*
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
 * queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 *
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
 *
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;

public class _69_수열과_구간_쿼리_4 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {0, 1, 2, 4, 3}, new int[][] {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}}));		// 3, 2, 4, 6, 4
	}

	// 연산
	public static int[] solution(int[] arr, int[][] queries) {
		for(int[] query : queries) {
			for(int i=query[0]; i<=query[1]; i++) {
				if(i%query[2]==0) {
					arr[i]++;
				}
			}
		}
		return arr;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
