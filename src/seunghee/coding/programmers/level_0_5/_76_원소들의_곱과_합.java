package seunghee.coding.programmers.level_0_5;

/*
 * 정수가 담긴 리스트 num_list가 주어질 때,
 * 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을
 * 크면 0을 return하도록 solution 함수를 완성해주세요.
 */

public class _76_원소들의_곱과_합 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {3, 4, 5, 2, 1}));			// 1
		print(solution(new int[] {5, 7, 8, 3}));			// 0
	}

	// 연산
	public static int solution(int[] num_list) {
		int sum = 0;
		int multi = 1;
		for(int num : num_list) {
			sum += num;
			multi *= num;
		}
		return Math.pow(sum, 2) > multi ? 1 : 0;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
