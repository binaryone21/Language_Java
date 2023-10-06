package seunghee.coding.programmers.level_0.ex011_ex020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * 정수 n이 매개변수로 주어질 때,
 * n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class ex_014_짝수는_싫어요 {
	// 입력
	public static void main(String[] args) {
		print(solution(10));		// [1, 3, 5, 7, 9]
		print(solution(15));		// [1, 3, 5, 7, 9, 11, 13, 15]
	}

	// 연산
	public static int[] solution(int n) {
		int[] answer = new int[++n/2];
		for(int i=0; i<answer.length; i++) {
			answer[i] = 1+2*i;
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
