package seunghee.coding.programmers.level_0.ex001_ex010;

/*
 * 정수 num1과 num2가 주어질 때,
 * num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
 */
public class ex_003_두_수의_합 {
	// 입력
	public static void main(String[] args) {
		print(solution(2, 3));		// 5
		print(solution(100, 2));	// 102
	}

	// 연산
	public static int solution(int num1, int num2) {
		return num1 + num2;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
