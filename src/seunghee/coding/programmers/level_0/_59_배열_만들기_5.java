package seunghee.coding.programmers.level_0;

/*
 * 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
 *
 * 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
 * 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _59_배열_만들기_5 {
	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"0123456789","9876543210","9999999999999"}, 50000, 5, 5)); 	// 56789, 99999
	}

	// 연산
	public static int[] solution(String[] intStrs, int k, int s, int l) {
		LinkedList<Integer> list = new LinkedList<>();
		for(String str : intStrs) {
			int i = Integer.valueOf(str.substring(s, s+l));
			if(i > k) {
				list.add(i);
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
