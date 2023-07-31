package seunghee.coding.programmers.level_0;

/*
 * 문자열 myString과 pat가 주어집니다.
 * myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서
 * return 하는 solution 함수를 완성해 주세요.
 */

public class _20_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
	// 입력
	public static void main(String[] args) {
		print(solution("AbCdEFG", "dE"));
		print(solution("AAAAaaaa", "a"));
	}

	// 연산
	public static String solution(String myString, String pat) {
		int idx = myString.lastIndexOf(pat);
		return myString.substring(0, idx)+pat;
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
