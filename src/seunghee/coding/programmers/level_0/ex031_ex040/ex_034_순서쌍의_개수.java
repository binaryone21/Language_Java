package seunghee.coding.programmers.level_0.ex031_ex040;

import java.util.Arrays;

/*
 * 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
 * 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를
 * return하도록 solution 함수를 완성해주세요.
 */
public class ex_034_순서쌍의_개수 {
	// 입력
	public static void main(String[] args) {
		print(solution(20));			// 6
		print(solution(100));		// 9
	}


	// 연산
	public static int solution(int n) {
		int answer = 0;
		int center = 0;
		for(int i=1; i<=Math.sqrt(n); i++) {
			if (n % i == 0) {
				answer++;
			}
			if(i == Math.sqrt(n)) {
				center = 1;
			}
		}
		return answer*2-center;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
