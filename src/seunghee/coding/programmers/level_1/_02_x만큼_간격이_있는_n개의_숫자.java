package seunghee.coding.programmers.level_1;
/*
 * 함수 solution은 정수 x와 자연수 n을 입력 받아,
 * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 */
import java.util.Arrays;

public class _02_x만큼_간격이_있는_n개의_숫자 {

	// 입력
	public static void main(String[] args) {
		print(solution(2, 5));
		print(solution(4, 3));
		print(solution(-4, 2));
	}

	// 연산
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		for(int i=0; i<n; i++) {
			answer[i] = x*(i+1);
		}
		
		return answer;
	}
	
	// 출력
	public static void print(long[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}