package seunghee.coding.programmers.level1;
/*
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수,
 * solution을 완성해주세요.
 */
public class _09_짝수와_홀수 {
	// 입력
	public static void main(String[] args) {
		print(solution(3));
		print(solution(4));
	}
	
	// 연산
	public static String solution(int num) {
		String answer = (num%2 == 0) ? "Even" : "Odd";
		return answer;
	}
	
	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
