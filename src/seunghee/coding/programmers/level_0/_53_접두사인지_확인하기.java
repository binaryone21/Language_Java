package seunghee.coding.programmers.level_0;

/*
 * 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
 * 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
 * 문자열 my_string과 is_prefix가 주어질 때,
 * is_prefix가 my_string의 접두사라면 1을,
 * 아니면 0을 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.regex.Pattern;

public class _53_접두사인지_확인하기 {
	// 입력
	public static void main(String[] args) {
		print(solution("banana", "ban")); 		// 1
		print(solution("banana", "nan")); 		// 0
		print(solution("banana", "abcd")); 		// 0
		print(solution("banana", "bananan")); 	// 0
	}

	// 연산
	public static int solution(String my_string, String is_prefix) {
		return my_string.matches(is_prefix + ".*") ? 1 : 0;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
