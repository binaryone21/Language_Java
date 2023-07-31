package seunghee.coding.programmers.level_0;

/*
 * 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다.
 * 문자열 rny_string이 주어질 때,
 * rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _11_my_string {
	// 입력
	public static void main(String[] args) {
		print(solution("masterpiece"));
		print(solution("programmers"));
		print(solution("jerry"));
		print(solution("burn"));
	}

	// 연산
	public static String solution(String my_string) {
		return my_string.replaceAll("m", "rn");
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
