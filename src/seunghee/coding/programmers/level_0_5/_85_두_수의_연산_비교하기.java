package seunghee.coding.programmers.level_0_5;

/*
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
 * 예를 들면 다음과 같습니다.
 *
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을
 * return하는 solution 함수를 완성해 주세요.
 *
 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 */

public class _85_두_수의_연산_비교하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(98, 2));	// 1
		print(solution(34, 3));	// 0
	}

	// 연산
	public static int solution(int num, int n) {
		return (0 == num%n) ? 1 : 0;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
