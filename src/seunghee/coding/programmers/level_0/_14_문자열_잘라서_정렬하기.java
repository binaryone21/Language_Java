package seunghee.coding.programmers.level_0;

/*
 * 문자열 myString이 주어집니다.
 * "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
 * 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _14_문자열_잘라서_정렬하기 {
	// 입력
	public static void main(String[] args) {
		print(solution("axbxcxdx"));
		print(solution("dxccxbbbxaaaa"));
	}

	// 연산
	public static String[] solution(String myString) {
		String[] split = myString.split("x");
		LinkedList<String> list = new LinkedList<>();
		for(String str : split) {
			if(!str.isEmpty()) {
				list.add(str);
			}
		}
		list.sort(null);
		String[] answer = new String[list.size()];
		for(int i=0; i< answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	// 출력
	public static void print(String[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
