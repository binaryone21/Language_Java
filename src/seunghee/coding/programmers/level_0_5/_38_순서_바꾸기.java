package seunghee.coding.programmers.level_0_5;

/*
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
 * n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를
 * return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;

public class _38_순서_바꾸기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {2, 1, 6}, 1));
		print(solution(new int[] {5, 2, 1, 7, 5}, 3));
	}

	// 연산
	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		System.arraycopy(num_list, n, answer, 0, num_list.length-n);
		System.arraycopy(num_list, 0, answer, num_list.length-n, n);
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
