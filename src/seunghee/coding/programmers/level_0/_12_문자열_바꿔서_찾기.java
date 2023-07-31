package seunghee.coding.programmers.level_0;

/*
 * 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
 * myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중
 * pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _12_문자열_바꿔서_찾기 {
	// 입력
	public static void main(String[] args) {
		print(solution("ABBAA", "AABB"));
		print(solution("ABAB", "ABAB"));
	}

	// 연산
	public static int solution(String myString, String pat) {
		return myString.replaceAll("A", "C")
				.replaceAll("B", "A")
				.replaceAll("C", "B")
				.contains(pat) ? 1 : 0;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
