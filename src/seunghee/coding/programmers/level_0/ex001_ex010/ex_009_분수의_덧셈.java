package seunghee.coding.programmers.level_0.ex001_ex010;

import java.util.Arrays;

/*
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
 * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을
 * return 하도록 solution 함수를 완성해보세요.
 */
public class ex_009_분수의_덧셈 {
	// 입력
	public static void main(String[] args) {
		print(solution(1, 2, 3, 4));	// [5, 4]
		print(solution(9, 2, 1, 3));	// [29, 6]
	}

	// 연산
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int top = numer1*denom2 + numer2*denom1;
		int bot = denom1*denom2;
		for(int i=bot; i>1; i--) {
			if(top%i == 0 && bot%i == 0) {
				top /= i;
				bot /= i;
				break;
			}
		}
		return new int[] {top, bot};
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
