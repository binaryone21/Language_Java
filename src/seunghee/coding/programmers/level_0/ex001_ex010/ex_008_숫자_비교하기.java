package seunghee.coding.programmers.level_0.ex001_ex010;

/*
 * 정수 num1과 num2가 매개변수로 주어집니다.
 * 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
 */
public class ex_008_숫자_비교하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(2, 3));		// -1
		print(solution(11, 11));	// 1
		print(solution(7, 99));		// -1
	}

	// 연산
	public static int solution(int num1, int num2) {
		return num1 == num2 ? 1 : -1;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
