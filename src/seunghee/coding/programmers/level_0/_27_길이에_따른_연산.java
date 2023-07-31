package seunghee.coding.programmers.level_0;

/*
 * 정수가 담긴 리스트 num_list가 주어질 때,
 * 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을
 * 10 이하이면 모든 원소의 곱을
 * return하도록 solution 함수를 완성해주세요.
 */

public class _27_길이에_따른_연산 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
		print(solution(new int[] {2, 3, 4, 5}));
	}

	// 연산
	public static int solution(int[] num_list) {
		int answer = 0;
		if(num_list.length > 10) {
			for(int i : num_list) {
				answer += i;
			}
		} else {
			answer = 1;
			for(int i : num_list) {
				answer *= i;
			}
		}
		return answer;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
