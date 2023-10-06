package seunghee.coding.programmers.level_0.ex021_ex030;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class ex_022_배열_뒤집기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 4, 5}));			// [5, 4, 3, 2, 1]
		print(solution(new int[] {1, 1, 1, 1, 1, 2}));		// [2, 1, 1, 1, 1, 1]
		print(solution(new int[] {1, 0, 1, 1, 1, 3, 5}));	// [5, 3, 1, 1, 1, 0, 1]
	}

	// 연산
	public static int[] solution(int[] num_list) {
		int[] answer= new int[num_list.length];
		for(int i=0; i<num_list.length; i++) {
			answer[num_list.length-1-i] = num_list[i];
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
