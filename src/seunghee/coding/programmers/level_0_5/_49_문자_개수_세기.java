package seunghee.coding.programmers.level_0_5;

/*
 * 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때,
 * my_string에서 'A'의 개수,
 * my_string에서 'B'의 개수,
 * ...,
 * my_string에서 'Z'의 개수,
 * my_string에서 'a'의 개수,
 * my_string에서 'b'의 개수,
 * ...,
 * my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을
 * return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;

public class _49_문자_개수_세기 {
	// 입력
	public static void main(String[] args) {
		print(solution("Programmers")); 	// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
	}

	// 연산
	public static int[] solution(String my_string) {
		int[] answer = new int[52];
		for(int i=0; i<my_string.length(); i++) {
			int c = my_string.charAt(i);
			c = (c < 96) ? c - 65 : c - 71;
			answer[c]++;
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
