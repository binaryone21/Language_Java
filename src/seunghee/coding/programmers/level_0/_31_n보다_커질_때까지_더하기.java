package seunghee.coding.programmers.level_0;

/*
 * 정수 배열 numbers와 정수 n이 매개변수로 주어집니다.
 * numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간
 * 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;

public class _31_n보다_커질_때까지_더하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {34, 5, 71, 29, 100, 34}, 123));
		print(solution(new int[] {58, 44, 27, 10, 100}, 139));
	}

	// 연산
	public static int solution(int[] numbers, int n) {
		int answer = 0;
		for(int i=0; i< numbers.length; i++) {
			answer += numbers[i];
			if(answer > n) {
				break;
			}
		}
		return answer;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
