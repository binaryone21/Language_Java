package seunghee.coding.programmers.level_0_5;

/*
 * 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
 * my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을
 * return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;

public class _16_공백으로_구분하기_1 {
	// 입력
	public static void main(String[] args) {
		print(solution("i love you"));
		print(solution("programmers"));
	}

	// 연산
	public static String[] solution(String my_string) {
		return my_string.split(" ");
	}

	// 출력
	public static void print(String[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
