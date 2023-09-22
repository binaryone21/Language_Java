package seunghee.coding.programmers.level_0_5;

/*
 * 양의 정수 n이 매개변수로 주어질 때,
 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
 */

public class _82_홀짝에_따라_다른_값_반환하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(7));	// 16
		print(solution(10));	// 220
	}

	// 연산
	public static int solution(int n) {
		int answer = 0;
		for(int i=1; i<=n; i++) {
			if(n%2 == i%2) {
				answer += Math.pow(i, (i%2 == 0) ? 2 : 1);
			}
		}
		return answer;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
