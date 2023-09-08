package seunghee.coding.programmers.level_0;

/*
 * 정수 n과 문자열 control이 주어집니다.
 * control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며,
 * control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
 *
 * "w" : n이 1 커집니다.
 * "s" : n이 1 작아집니다.
 * "d" : n이 10 커집니다.
 * "a" : n이 10 작아집니다.
 * 위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는
 * n의 값을 return 하는 solution 함수를 완성해 주세요.
 */

public class _73_수_조작하기_1 {
	// 입력
	public static void main(String[] args) {
		print(solution(0, "wsdawsdassw"));		// -1
	}

	// 연산
	public static int solution(int n, String control) {
		for(String str : control.split("")) {
			switch (str) {
				case "w" : n += 1; break;
				case "s" : n -= 1; break;
				case "d" : n += 10; break;
				case "a" : n -= 10; break;
			}
		}
		return n;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
