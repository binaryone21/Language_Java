package seunghee.coding.programmers.level_0.ex021_ex030;

/*
 * 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
 * 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
 */
public class ex_021_나이_출력하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(40));		// 1983
		print(solution(23));		// 2000
	}

	// 연산
	public static int solution(int age) {
		return 2023 - age;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
