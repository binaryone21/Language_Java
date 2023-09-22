package seunghee.coding.programmers.level_0_5;

/*
 * 문자열 배열 strArr가 주어집니다.
 * 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고
 * 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _18_ad_제거하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"and","notad","abcd"}));
		print(solution(new String[] {"there","are","no","a","ds"}));
	}

	// 연산
	public static String[] solution(String[] strArr) {
		LinkedList<String> list = new LinkedList<>();
		for(String str : strArr) {
			if(!str.contains("ad")) {
				list.add(str);
			}
		}

		String[] answer = new String[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	// 출력
	public static void print(String[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
