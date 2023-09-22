package seunghee.coding.programmers.level_0_5;

/*
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을
 * 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _35_n개_간격의_원소들 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {4, 2, 6, 1, 7, 6}, 2));
		print(solution(new int[] {4, 2, 6, 1, 7, 6}, 4));
	}

	// 연산
	public static int[] solution(int[] num_list, int n) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i< num_list.length; i+=n) {
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
