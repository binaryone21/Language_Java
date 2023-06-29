package seunghee.coding.programmers.level_1;
/*
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
 * n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
public class _11_정수_제곱근_판별 {

	// 입력
	public static void main(String[] args) {
		print(solution(121));
		print(solution(3));
	}
	
	// 연산
	public static long solution(long num) {
		long answer = 0;
		
		double i = Math.sqrt(num); 
		if(i == Math.floor(i)) {
			answer = (long)Math.pow(i+1, 2);
		} else {
			answer = -1;
		}

		return answer;
	}
	
	// 출력
	public static void print(long answer) {
		System.out.println(answer);
	}
}
