package seunghee.coding.programmers.level_0.ex011_ex020;

/*
 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
 * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
 * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를
 * return 하도록 solution 함수를 완성해보세요.
 */
public class ex_016_피자_나눠_먹기_2 {
	// 입력
	public static void main(String[] args) {
		print(solution(7, 10));		// 2
		print(solution(4, 12));		// 3
	}
	// 연산
	public static int solution(int slice, int n) {
		return (slice+n-1) / slice;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
