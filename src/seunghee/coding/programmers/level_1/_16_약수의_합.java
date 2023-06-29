package seunghee.coding.programmers.level_1;
/*
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수,
 * solution을 완성해주세요.
 */
public class _16_약수의_합 {

	// 입력
	public static void main(String[] args) {
		print(solution(12));
		print(solution(5));
	}
	
	public static int solution(int num) {
		int answer = (num == 1) ? 1 : 0;
		
		int check = num;
		for(int i=1; i<check; i++) {
			if(num%i == 0) {
				check = num/i;
				answer += i;
				if(i != check) {
					answer += check;
				}
			}
		}
		
		return answer;
	}
	
	public static void print(int answer) {
		System.out.println(answer);
	}
}
