package seunghee.coding.programmers.level_0_5;

/*
 * 정수 배열 arr이 매개변수로 주어집니다.
 * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
 * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;

public class _05_배열의_길이를_2의_거듭제곱으로_만들기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 4, 5, 6}));
		print(solution(new int[] {58, 172, 746, 89}));
	}

	// 연산
	public static int[] solution(int[] arr) {
		int size = 2;
		while(size < arr.length) {
			size *= 2;
		}
		int[] answer = new int[size];
		System.arraycopy(arr, 0, answer, 0, arr.length);
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
