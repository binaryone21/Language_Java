package seunghee.coding.programmers.level_0_5;

/*
 * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
 * flag가 true면 a + b를 false면 a - b를
 * return 하는 solution 함수를 작성해 주세요.
 */

public class _80_flag에_따라_다른_값_반환하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(-4, 7, true));	// 3
		print(solution(-4, 7, false));	// -11
	}

	// 연산
	public static int solution(int a, int b, boolean flag) {
		return flag ? a+b : a-b;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
