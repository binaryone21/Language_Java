package seunghee.coding.programmers.level_0;

/*
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를
 * return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;

public class _39_n_번째_원소부터 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {2, 1, 6}, 3));
		print(solution(new int[] {5, 2, 1, 7, 5}, 2));
	}

	// 연산
	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length-n+1];
		System.arraycopy(num_list, n-1, answer, 0, num_list.length-n+1);
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
