package seunghee.coding.programmers.level_0.ex021_ex030;

/*
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을
 * return 하도록 solution 함수를 작성해주세요.
 */
public class ex_030_짝수의_합 {
	// 입력
	public static void main(String[] args) {
		print(solution(10));		// 30
		print(solution(4));		// 6
	}


	// 연산
	public static int solution(int n) {
		int answer = 0;
		for(int i=2; i<=n; i+=2) {
			answer += i;
		}
		return answer;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
