package seunghee.coding.programmers.level_0_5;

/*
 * 두 정수 q, r과 문자열 code가 주어질 때,
 * code의 각 인덱스를 q로 나누었을 때
 * 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을
 * return 하는 solution 함수를 작성해 주세요.
 */

public class _50_qr_code {
	// 입력
	public static void main(String[] args) {
		print(solution(3, 1, "qjnwezgrpirldywt")); 	// jerry
		print(solution(1, 0, "programmers")); 		// programmers
	}

	// 연산
	public static String solution(int q, int r, String code) {
		StringBuilder sb = new StringBuilder();
		for(int i=r; i<code.length(); i+=q) {
			sb.append(code.charAt(i));
		}
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
