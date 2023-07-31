package seunghee.coding.programmers.level_0;

/*
 * 문자열 my_string과 두 정수 m, c가 주어집니다.
 * my_string을 한 줄에 m 글자씩 가로로 적었을 때
 * 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로
 * return 하는 solution 함수를 작성해 주세요.
 */

public class _51_세로_읽기 {
	// 입력
	public static void main(String[] args) {
		print(solution("ihrhbakrfpndopljhygc", 4, 2)); 	// happy
		print(solution("programmers", 1, 1)); 				// programmers
	}

	// 연산
	public static String solution(String my_string, int m, int c) {
		StringBuilder sb = new StringBuilder();
		for(int i=c-1; i<my_string.length(); i+=m) {
			sb.append(my_string.charAt(i));
		}
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
