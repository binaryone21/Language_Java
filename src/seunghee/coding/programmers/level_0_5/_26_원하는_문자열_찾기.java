package seunghee.coding.programmers.level_0_5;

/*
 * 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
 * myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을
 * return 하는 solution 함수를 완성해 주세요.
 * 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
 */

public class _26_원하는_문자열_찾기 {
	// 입력
	public static void main(String[] args) {
		print(solution("AbCdEfG", "aBc"));
		print(solution("aaAA", "aaaaa"));
	}

	// 연산
	public static int solution(String myString, String pat) {
		return (myString.toLowerCase().contains(pat.toLowerCase())) ? 1 : 0;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
