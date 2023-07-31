package seunghee.coding.programmers.level_0;

/*
 * 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.
 * 예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.
 * 문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _10_세_개의_구분자 {
	// 입력
	public static void main(String[] args) {
		print(solution("baconlettucetomato"));
		print(solution("abcd"));
		print(solution("cabab"));
	}

	// 연산
	public static String[] solution(String myStr) {
		String[] splitStr = myStr.split("[a-c]");
		LinkedList<String> list = new LinkedList<>();
		for(String str : splitStr) {
			if(!"".equals(str)) {
				list.add(str);
			}
		}
		if(list.isEmpty()) {
			list.add("EMPTY");
		}
		String[] answer = new String[list.size()];
		for(int i=0; i< answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer ;
	}

	// 출력
	public static void print(String[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
