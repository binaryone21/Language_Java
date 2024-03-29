package seunghee.coding.programmers.level_1;
/*
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한
 * 모든 정수의 합을 리턴하는 함수,
 * solution을 완성하세요.
 * 예를 들어 a = 3, b = 5인 경우,
 * 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 */
public class _26_두_정수_사이의_합 {

	// 입력
	public static void main(String[] args) {
		print(solution(3, 5));
		print(solution(3, 3));
		print(solution(5, 3));
	}
	
	// 연산
	public static long solution(int a, int b) {
		return ((long)(Math.abs(b - a) + 1) * (long)(a + b) / 2);
	}
	
	// 출력
	public static void print(long answer) {
		System.out.println(answer);
	}
}
