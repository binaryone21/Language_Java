package seunghee.coding.programmers.level_0;

/*
 * 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
 * my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을
 * 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class _62_글자_이어_붙여_문자열_만들기 {
	// 입력
	public static void main(String[] args) {
		print(solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7})); 					// programmers
		print(solution("zpiaz", new int[] {1, 2, 0, 0, 3})); 	// pizza
	}

	// 연산
	public static String solution(String my_string, int[] index_list) {
		StringBuilder sb = new StringBuilder();
		for(int i : index_list) {
			sb.append(my_string.charAt(i));
		}
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
