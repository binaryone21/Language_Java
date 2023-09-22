package seunghee.coding.programmers.level_0_5;

/*
 * 문자열 my_string과 정수 배열 indices가 주어질 때,
 * my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고
 * 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;

public class _47_글자_지우기 {
	// 입력
	public static void main(String[] args) {
		print(solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3})); 	// programmers
	}

	// 연산
	public static String solution(String my_string, int[] indices) {
		String[] strArr = my_string.split("");
		Arrays.sort(indices);
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i=0; i<strArr.length; i++) {
			if(cnt < indices.length && i==indices[cnt]) {
				cnt++;
				continue;
			}
			sb.append(strArr[i]);
		}
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
