package seunghee.coding.programmers.level_0.ex001_ex010;

import java.util.Arrays;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 각 원소에 두배한 원소를 가진 배열을
 * return하도록 solution 함수를 완성해주세요.
 */
public class ex_010_배열_두_배_만들기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 4, 5}));				// [2, 4, 6, 8, 10]
		print(solution(new int[] {1, 2, 100, -99, 1, 2, 3}));	// [2, 4, 200, -198, 2, 4, 6]
	}

	// 연산
	public static int[] solution(int[] numbers) {
		for(int i=0; i<numbers.length; i++) {
			numbers[i] *= 2;
		}
		return numbers;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
