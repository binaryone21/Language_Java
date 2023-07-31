package seunghee.coding.programmers.level_0;

/*
 * 문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
 * my_string에서 인덱스 s부터 인덱스 e까지를
 * 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class _52_문자열_뒤집기 {
	// 입력
	public static void main(String[] args) {
		print(solution("Progra21Sremm3", 6, 12)); 	// ProgrammerS123
		print(solution("Stanley1yelnatS", 4, 10)); 	// Stanley1yelnatS
	}

	// 연산
	public static String solution(String my_string, int s, int e) {
		StringBuilder sb = new StringBuilder(my_string.substring(s, e+1)).reverse();
		sb.insert(0, my_string.substring(0, s));
		sb.append(my_string.substring(e+1));
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
