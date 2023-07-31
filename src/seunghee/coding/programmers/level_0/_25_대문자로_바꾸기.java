package seunghee.coding.programmers.level_0;

/*
 * 알파벳으로 이루어진 문자열 myString이 주어집니다.
 * 모든 알파벳을 대문자로 변환하여 return 하는
 * solution 함수를 완성해 주세요.
 */

public class _25_대문자로_바꾸기 {
	// 입력
	public static void main(String[] args) {
		print(solution("aBcDeFg"));
		print(solution("aaa"));
	}

	// 연산
	public static String solution(String myString) {
		return myString.toUpperCase();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
