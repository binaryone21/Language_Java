package seunghee.coding.programmers.level_0_5;

/*
 * 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
 * intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다.
 * 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
 *
 * 이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을
 * 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _42_배열_만들기_3 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 4, 5}, new int[][] {{1, 3}, {0, 4}})); // 2, 3, 4, 1, 2, 3, 4, 5
	}

	// 연산
	public static int[] solution(int[] arr, int[][] intervals) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int[] arr1 : intervals) {
			for(int i=arr1[0]; i<=arr1[1]; i++) {
				list.add(arr[i]);
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i< answer.length; i++) {
			answer[i] = list.get(i);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
