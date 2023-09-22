package seunghee.coding.programmers.level_0_5;

/*
 * 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
 *
 * 두 수가 n과 m이라면
 * ">", "=" : n >= m
 * "<", "=" : n <= m
 * ">", "!" : n > m
 * "<", "!" : n < m
 * 두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다.
 * 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면
 * 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
 */

public class _81_조건_문자열 {
	// 입력
	public static void main(String[] args) {
		print(solution("<", "=", 20, 50));	// 1
		print(solution(">", "!", 41, 78));	// 0
	}

	// 연산
	public static int solution(String ineq, String eq, int n, int m) {
		return ((">".equals(ineq))
					? ("=".equals(eq)) ? n >= m : n > m
					: ("=".equals(eq)) ? n <= m : n < m) ? 1 : 0;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
