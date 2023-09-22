package seunghee.coding.programmers.level_0_5;

/*
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
 * my_string의 앞의 n글자로 이루어진
 * 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class _54_문자열의_앞의_n글자 {
	// 입력
	public static void main(String[] args) {
		print(solution("ProgrammerS123", 11)); 	// ProgrammerS
		print(solution("He110W0r1d", 5)); 			// He110
	}

	// 연산
	public static String solution(String my_string, int n) {
		return my_string.substring(0, n);
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
