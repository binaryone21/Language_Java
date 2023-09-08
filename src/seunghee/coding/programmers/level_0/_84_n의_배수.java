package seunghee.coding.programmers.level_0;

/*
 * 정수 num과 n이 매개 변수로 주어질 때,
 * num이 n의 배수이면 1을 return
 * n의 배수가 아니라면 0을 return하도록
 * solution 함수를 완성해주세요.
 */

public class _84_n의_배수 {
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
