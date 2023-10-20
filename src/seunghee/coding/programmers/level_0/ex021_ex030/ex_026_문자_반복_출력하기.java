package seunghee.coding.programmers.level_0.ex021_ex030;

/*
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을
 * return 하도록 solution 함수를 완성해보세요.
 */
public class ex_026_문자_반복_출력하기 {
	// 입력
	public static void main(String[] args) {
		print(solution("hello",	3));		// "hhheeellllllooo"
	}

	// 연산
	public static String solution(String my_string, int n) {
		StringBuilder sb = new StringBuilder();
		for(char c : my_string.toCharArray()) {
			for(int i=0; i<n; i++) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
