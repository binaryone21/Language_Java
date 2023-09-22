package seunghee.coding.programmers.level_0_5;

/*
 * 최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때,
 * 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _33_5명씩 {
	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"}));
	}

	// 연산
	public static String[] solution(String[] names) {
		LinkedList<String> list = new LinkedList<>();
		for(int i=0; i< names.length; i+=5) {
			list.add(names[i]);
		}
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
