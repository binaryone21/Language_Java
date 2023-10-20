package seunghee.coding.programmers.level_0.ex021_ex030;

import java.util.Arrays;

/*
 * 정수가 담긴 리스트 num_list가 주어질 때,
 * num_list의 원소 중 짝수와 홀수의 개수를 담은
 * 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class ex_025_짝수_홀수_개수 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 4, 5}));		// [2, 3]
		print(solution(new int[] {1, 3, 5, 7}));		// [0, 4]
	}

	// 연산
	public static int[] solution(int[] num_list) {
		int[] answer = new int[2];
		for(int i : num_list) {
			answer[i%2]++;
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
