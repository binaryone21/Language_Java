package seunghee.coding.programmers.level_0_5;

/*
 * 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
 * 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
 * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을
 * return 하는 solution 함수를 작성해 주세요.
 */

public class _78_등차수열의_특정한_항만_더하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(3, 4, new boolean[] {true, false, false, true, true}));					// 37
		print(solution(7, 1, new boolean[] {false, false, false, true, false, false, false}));	// 10
	}

	// 연산
	public static int solution(int a, int d, boolean[] included) {
		int answer = 0;
		for(boolean isTrue : included) {
			if(isTrue) {
				answer += a;
			}
			a += d;
		}
		return answer;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
