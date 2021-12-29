package seunghee.coding._01_programmers.level1;
/*
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수,
 * solution을 만들어 보세요.
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 */
public class _20_소수_찾기 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(10));
		print(solution(5));
	}
	
	// 연산
	public static int solution(int num) {
		int answer = 0;
		
		for(int i=2; i<=num; i++) {
			if(findPrimeNumber(i)) {
				answer++;
			}
		}
		
		return answer;
	}

	public static boolean findPrimeNumber(int target) {
		for(int i=2; i<=Math.sqrt(target); i++) {
			if(target%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
