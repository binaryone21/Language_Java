package seunghee.coding.programmers.level_1;
/*
 * 자연수 N이 주어지면,
 * N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class _14_자릿수_더하기 {

	// 입력
	public static void main(String[] args) {
		print(solution(123));
		print(solution(987));
	}
	
	// 연산
	public static int solution(int num) {
		int answer = 0;
		
		while(num >= 1) {
			answer += num%10;
			num /= 10;
		}
		
		return answer;
	}
	
	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
