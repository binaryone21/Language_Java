package seunghee.coding.programmers.level_0;

/*
 * 문자열 배열 strArr가 주어집니다.
 * 모든 원소가 알파벳으로만 이루어져 있을 때,
 * 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로,
 * 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는
 * solution 함수를 완성해 주세요.
 */

import java.util.Arrays;

public class _23_배열에서_문자열_대소문자_변환하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"AAA","BBB","CCC","DDD"}));
		print(solution(new String[] {"aBc","AbC"}));
	}

	// 연산
	public static String[] solution(String[] strArr) {
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = (i%2==0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
		}
		return strArr;
	}

	// 출력
	public static void print(String[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
