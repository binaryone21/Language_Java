package seunghee.coding.programmers.level_0_5;

/*
 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다.
 * 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때,
 * flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고,
 * flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤
 * X를 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _08_빈_배열에_추가_삭제하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {3, 2, 4, 1, 3}, new boolean[] {true, false, true, false, false}));
	}

	// 연산
	public static int[] solution(int[] arr, boolean[] flag) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			if(flag[i]) {
				for(int k=0; k<arr[i]*2; k++) {
					list.add(arr[i]);
				}
			} else {
				for(int k=0; k<arr[i]; k++) {
					list.removeLast();
				}
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer ;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
