package seunghee.coding.programmers.level_0_5;

/*
 * 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
 * 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
 * 문자열 my_string과 is_suffix가 주어질 때,
 * is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
 */

public class _55_접미사인지_확인하기 {
	// 입력
	public static void main(String[] args) {
		print(solution("banana", "ana")); 		// 1
		print(solution("banana", "nan")); 		// 0
		print(solution("banana", "wxyz")); 		// 0
		print(solution("banana", "abanana")); 	// 0
	}

	// 연산
	public static int solution(String my_string, String is_suffix) {
		return my_string.matches(".*" + is_suffix) ? 1 : 0;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
