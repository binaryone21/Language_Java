package seunghee.coding.programmers.level_0_5;

/*
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 n 번째 원소까지의
 * 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _36_n_번째_원소까지 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {2, 1, 6}, 1));
		print(solution(new int[] {5, 2, 1, 7, 5}, 3));
	}

	// 연산
	public static int[] solution(int[] num_list, int n) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<n; i++) {
			list.add(num_list[i]);
		}
		int[] answer = new int[list.size()];
		for(int i=0; i< answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
