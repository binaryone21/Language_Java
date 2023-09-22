package seunghee.coding.programmers.level_0_5;

/*
 * 정수 배열 arr와 query가 주어집니다.
 * query를 순회하면서 다음 작업을 반복합니다.
 * 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고
 * 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
 * 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고
 * 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
 * 위 작업을 마친 후 남은 arr의 부분 배열을
 * return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _40_배열_조각하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {0, 1, 2, 3, 4, 5}, new int[] {4, 1, 2}));
		print(solution(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, new int[] {5, 2, 2}));
	}

	// 연산
	public static int[] solution(int[] arr, int[] query) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		for(int i=0; i<query.length; i++) {
			if(i%2 == 0) {
				for(int k=query[i]; k<list.size(); k++) {
					list.removeLast();
				}
			} else {
				for(int k=0; k<query[i]; k++) {
					list.removeFirst();
				}
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
