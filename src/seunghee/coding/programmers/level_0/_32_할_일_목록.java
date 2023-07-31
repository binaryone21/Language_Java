package seunghee.coding.programmers.level_0;

/*
 * 오늘 해야 할 일이 담긴 문자열 배열 todo_list와
 * 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때,
 * todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을
 * return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _32_할_일_목록 {
	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[] {true, false, true, false}));
	}

	// 연산
	public static String[] solution(String[] todo_list, boolean[] finished) {
		LinkedList<String> list = new LinkedList<>();
		for(int i=0; i< todo_list.length; i++) {
			if(!finished[i]) {
				list.add(todo_list[i]);
			}
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
