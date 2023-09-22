package seunghee.coding.programmers.level_0_5;

/*
 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다.
 * 양의 정수 배열 arr가 매개변수로 주어질 때,
 * arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤에
 * 배열 X를 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _09_배열의_원소만큼_추가하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {5, 1, 4}));
		print(solution(new int[] {6, 6}));
		print(solution(new int[] {1}));
	}

	// 연산
	public static int[] solution(int[] arr) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i]; k++) {
				list.add(arr[i]);
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
