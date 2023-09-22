package seunghee.coding.programmers.level_0_5;

/*
 * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서
 * 숫자 "0"과 "5"로만 이루어진 모든 정수를
 * 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _68_배열_만들기_2 {
	// 입력
	public static void main(String[] args) {
		print(solution(5, 555));		// 5, 50, 55, 500, 505, 550, 555
		print(solution(10, 20));		// -1
	}

	// 연산
	public static int[] solution(int l, int r) {
		LinkedList<Integer> list = new LinkedList<>();
		l = l/5*5;
		r = r/5*5;
		for(int i=l; i<=r; i+=5) {
			if(String.valueOf(i).replaceAll("[05]", "").length() == 0) {
				list.add(i);
			}
		}
		if(list.isEmpty()) {
			list.add(-1);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
