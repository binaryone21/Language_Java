package seunghee.coding.programmers.level_0.ex031_ex040;

import java.util.Arrays;

/*
 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을
 * return 하도록 solution 함수를 완성해보세요.
 */
public class ex_031_배열_자르기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 4, 5}, 1, 3));		// [2, 3, 4]
		print(solution(new int[] {1, 3, 5}, 1, 2));				// [3, 5]
	}


	// 연산
	public static int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2-num1+1];
		System.arraycopy(numbers, num1, answer, 0, answer.length);
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
