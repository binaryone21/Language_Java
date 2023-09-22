package seunghee.coding.programmers.level_0_5;

/*
 * 정수 배열 arr가 주어집니다.
 * 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을
 * return 하는 solution 함수를 완성해 주세요.
 *
 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
 */

import java.util.Arrays;

public class _41_2의_영역 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 1, 4, 5, 2, 9}));
		print(solution(new int[] {1, 2, 1}));
		print(solution(new int[] {1, 1, 1}));
		print(solution(new int[] {1, 2, 1, 2, 1, 10, 2, 1}));
	}

	// 연산
	public static int[] solution(int[] arr) {
		int first = -1;
		int last = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 2) {
				if(first == -1) {
					first = i;
				}
				last = i;
			}
		}
		int[] answer = new int[last - first + 1];
		if ((first == -1)) {
			answer[0] = -1;
		} else {
			System.arraycopy(arr, first, answer, 0, last - first + 1);
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
