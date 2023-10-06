package seunghee.coding.programmers.level_0.ex001_ex010;

/*
 * 정수 num1, num2가 매개변수로 주어질 때,
 * num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
 */
public class ex_007_두_수의_나눗셈 {
	// 입력
	public static void main(String[] args) {
		print(solution(3, 2));		// 1500
		print(solution(7, 3));		// 2333
		print(solution(1, 16));		// 62
	}

	// 연산
	public static int solution(int num1, int num2) {
		return 1000 * num1 / num2;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
