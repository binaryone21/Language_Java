package seunghee.coding.programmers.level_0.ex031_ex040;

import java.util.Arrays;

/*
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을
 * return하도록 solution 함수를 완성해주세요.
 */
public class ex_033_진료순서_정하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {3, 76, 24}));					// [3, 1, 2]
		print(solution(new int[] {1, 2, 3, 4, 5, 6, 7}));		// [7, 6, 5, 4, 3, 2, 1]
		print(solution(new int[] {30, 10, 23, 6, 100}));		// [2, 4, 3, 5, 1]
	}


	// 연산
	public static int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		for(int i=0; i<emergency.length; i++) {
			for(int j=0; j<emergency.length; j++) {
				if(emergency[i] <= emergency[j]) {
					answer[i]++;
				}
			}
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
