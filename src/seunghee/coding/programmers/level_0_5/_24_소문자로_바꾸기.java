package seunghee.coding.programmers.level_0_5;

/*
 * 알파벳으로 이루어진 문자열 myString이 주어집니다.
 * 모든 알파벳을 소문자로 변환하여
 * return 하는 solution 함수를 완성해 주세요.
 */

public class _24_소문자로_바꾸기 {
	// 입력
	public static void main(String[] args) {
		print(solution("aBcDeFg"));
		print(solution("aaa"));
	}

	// 연산
	public static String solution(String myString) {
		return myString.toLowerCase();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
