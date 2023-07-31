package seunghee.coding.programmers.level_0;

/*
 * 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
 * str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를,
 * 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을
 * 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * "l"이나 "r"이 없다면 빈 리스트를 return합니다.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _37_왼쪽_오른쪽 {
	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"u", "u", "l", "r"}));
		print(solution(new String[] {"u", "r", "u", "l"}));
		print(solution(new String[] {"l"}));
	}

	// 연산
	public static String[] solution(String[] str_list) {
		LinkedList<String> list = new LinkedList<>();
		boolean isFisrt = true;
		for(String str : str_list) {
			if("l".equals(str) && isFisrt) {
				isFisrt = !isFisrt;
				break;
			}
			list.add(str);
			if("r".equals(str) && isFisrt) {
				isFisrt = !isFisrt;
				list.clear();
			}
		}
		if(isFisrt) {
			list.clear();
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
