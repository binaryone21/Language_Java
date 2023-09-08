package seunghee.coding.programmers.level_0;

/*
 * 정수 start와 end가 주어질 때, start부터 end까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _67_카운트_업 {
	// 입력
	public static void main(String[] args) {
		print(solution(3, 10));		// 3, 4, 5, 6, 7, 8, 9, 10
	}

	// 연산
	public static int[] solution(int start, int end) {
		int[] answer = new int[end-start+1];
		for(int i=0; i<answer.length; i++) {
			answer[i] = start+i;
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
