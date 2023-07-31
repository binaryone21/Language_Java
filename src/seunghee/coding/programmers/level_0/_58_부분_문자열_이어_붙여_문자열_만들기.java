package seunghee.coding.programmers.level_0;

/*
 * 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.
 * parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다.
 * 각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인
 * 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class _58_부분_문자열_이어_붙여_문자열_만들기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}})); 	// programmers
	}

	// 연산
	public static String solution(String[] my_strings, int[][] parts) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<parts.length; i++) {
			sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
		}
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
