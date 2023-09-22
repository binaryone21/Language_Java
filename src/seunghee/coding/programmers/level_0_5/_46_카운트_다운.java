package seunghee.coding.programmers.level_0_5;

/*
 * 정수 start와 end가 주어질 때,
 * start에서 end까지 1씩 감소하는
 * 수들을 차례로 담은 리스트를
 * return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;

public class _46_카운트_다운 {
	// 입력
	public static void main(String[] args) {
		print(solution(10, 3)); 	// [10, 9, 8, 7, 6, 5, 4, 3]
	}

	// 연산
	public static int[] solution(int start, int end) {
		int[] answer = new int[start-end+1];
		for(int i=0; i<answer.length; i++) {
			answer[i] = start--;
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
