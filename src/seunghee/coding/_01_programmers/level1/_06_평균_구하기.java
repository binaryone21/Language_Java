package seunghee.coding._01_programmers.level1;
/*
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수,
 * solution을 완성해보세요.
 */
public class _06_평균_구하기 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(new int[]{1,2,3,4}));
		print(solution(new int[]{5,5}));
	}

	// 연산
	public static double solution(int[] arr) {
		double answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		answer /= arr.length;
		
		return answer;
	}

	// 출력
	public static void print(double answer) {
		System.out.println(answer);
	}
}
