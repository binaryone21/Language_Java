package seunghee.coding.programmers.level_0.ex001_ex010;

/*
 * 정수 num1, num2가 매개변수 주어집니다.
 * num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
 */
public class ex_005_두_수의_곱 {
	// 입력
	public static void main(String[] args) {
		print(solution(3, 4));		// 12
		print(solution(27, 19));	// 513
	}

	// 연산
	public static int solution(int num1, int num2) {
		return num1 * num2;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
