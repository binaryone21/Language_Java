package seunghee.coding.programmers.level_0_5;

/*
 * boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
 * 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
 *
 * (x1 ∨ x2) ∧ (x3 ∨ x4)
 */

public class _64_간단한_논리_연산 {
	// 입력
	public static void main(String[] args) {
		print(solution(false, true, true, true));	// true
		print(solution(true, false, false, false));	// false
	}

	// 연산
	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		return (x1|x2)&(x3|x4);
	}

	// 출력
	public static void print(boolean answer) {
		System.out.println(answer);
	}
}
