package seunghee.coding.programmers.level_0.ex021_ex030;

import java.util.Arrays;

/*
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class ex_023_문자열_뒤집기 {
	// 입력
	public static void main(String[] args) {
		print(solution("jaron"));		// "noraj"
		print(solution("bread"));		// "daerb"
	}

	// 연산
	public static String solution(String my_string) {
		StringBuilder sb = new StringBuilder(my_string);
		return sb.reverse().toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
