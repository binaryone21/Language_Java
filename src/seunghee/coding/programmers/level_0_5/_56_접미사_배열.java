package seunghee.coding.programmers.level_0_5;

/*
 * 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
 * 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
 * 문자열 my_string이 매개변수로 주어질 때,
 * my_string의 모든 접미사를 사전순으로 정렬한
 * 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;

public class _56_접미사_배열 {
	// 입력
	public static void main(String[] args) {
		print(solution("banana")); 		// ["a", "ana", "anana", "banana", "na", "nana"]
		print(solution("programmers")); 	// ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
	}

	// 연산
	public static String[] solution(String my_string) {
		String[] answer = new String[my_string.length()];
		for(int i=0; i<my_string.length(); i++) {
			answer[i] = my_string.substring(i);
		}
		Arrays.sort(answer);
		return answer;
/*
		LinkedList<String> list = new LinkedList<>();
		for(int i=0; i<my_string.length(); i++) {
			list.add(my_string.substring(i));
		}
		list.sort(null);
		return list.toArray(new String[ list.size()]);
*/
	}

	// 출력
	public static void print(String[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
