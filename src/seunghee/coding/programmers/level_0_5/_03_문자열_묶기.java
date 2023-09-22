package seunghee.coding.programmers.level_0_5;

/*
 * 문자열 배열 strArr이 주어집니다.
 * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
 * 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 */
import java.util.*;

public class _03_문자열_묶기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"a","d"}));
		print(solution(new String[] {"bc","hi"}));
		print(solution(new String[] {"efg"}));
	}

	// 연산
	public static int solution(String[] strArr) {
		Map<Integer, Integer> listCount = new HashMap<>();
		int answer = 0;
		for(String str : strArr) {
			if(!listCount.containsKey(str.length())) {
				listCount.put(str.length(), 0);
			}
			int count = (listCount.get(str.length()) + 1);
			listCount.put(str.length(), count);
			answer = Math.max(answer, count);
		}
		return answer;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
