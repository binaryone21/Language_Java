package seunghee.coding.programmers.level_0;

/*
 * 정수 number와 n, m이 주어집니다.
 * number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을
 * return하도록 solution 함수를 완성해주세요.
 */

public class _83_공배수 {
	// 입력
	public static void main(String[] args) {
		print(solution(60, 2, 3));	// 1
		print(solution(55, 10, 5));	// 0
	}

	// 연산
	public static int solution(int number, int n, int m) {
		return (0 == number%n && 0 == number%m) ? 1 : 0;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
