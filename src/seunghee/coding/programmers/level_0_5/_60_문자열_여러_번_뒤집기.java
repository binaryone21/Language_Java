package seunghee.coding.programmers.level_0_5;

/*
 * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
 * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
 * my_string에 queries의 명령을 순서대로 처리한 후의
 * 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class _60_문자열_여러_번_뒤집기 {
	// 입력
	public static void main(String[] args) {
		print(solution("rermgorpsam", new int[][] {{2, 3}, {0, 7}, {5, 9}, {6, 10}})); 	// programmers
	}

	// 연산
	public static String solution(String my_string, int[][] queries) {
		StringBuilder sb;
		for(int[] query : queries) {
			sb = new StringBuilder(my_string.substring(query[0], query[1]+1)).reverse();
			sb.insert(0, my_string.substring(0, query[0]));
			sb.append(my_string.substring(query[1]+1));
			my_string = sb.toString();
		}
		return my_string;
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
