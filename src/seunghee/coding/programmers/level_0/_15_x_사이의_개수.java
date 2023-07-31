package seunghee.coding.programmers.level_0;

/*
 * 문자열 myString이 주어집니다.
 * myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를
 * 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _15_x_사이의_개수 {
	// 입력
	public static void main(String[] args) {
		print(solution("oxooxoxxox"));
		print(solution("xabcxdefxghi"));
	}

	// 연산
	public static int[] solution(String myString) {
		String[] split = myString.split("x");
		LinkedList<Integer> list = new LinkedList<>();
		for(String str : split) {
			list.add(str.length());
		}
		if('x' == myString.charAt(myString.length()-1)) {
			list.add(0);
		}
		int[] answer = new int[list.size()];
		for(int i=0; i< answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
