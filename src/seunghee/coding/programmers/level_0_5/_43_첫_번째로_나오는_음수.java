package seunghee.coding.programmers.level_0_5;

/*
 * 정수 리스트 num_list가 주어질 때,
 * 첫 번째로 나오는 음수의 인덱스를
 * return 하도록 solution 함수를 완성해주세요.
 * 음수가 없다면 -1을 return 합니다.
 */

public class _43_첫_번째로_나오는_음수 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {12, 4, 15, 46, 38, -2, 15})); // 5
		print(solution(new int[] {13, 22, 53, 24, 15, 6})); // -1
	}

	// 연산
	public static int solution(int[] num_list) {
		for(int i=0; i<num_list.length; i++) {
			if(num_list[i] < 0) {
				return i;
			}
		}
		return -1;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
