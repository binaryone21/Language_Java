package seunghee.coding.programmers.level_0;

/*
 * 문자열 myString과 pat이 주어집니다.
 * myString에서 pat이 등장하는 횟수를
 * return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _19_문자열이_몇_번_등장하는지_세기 {
	// 입력
	public static void main(String[] args) {
		print(solution("banana", "ana"));
		print(solution("aaaa", "aa"));
	}

	// 연산
	public static int solution(String myString, String pat) {
		int cnt = 0;
		for(int i=0; i<myString.length(); i++) {
			if(myString.indexOf(pat, i) == i) {
				cnt++;
			}
		}
		return cnt;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
