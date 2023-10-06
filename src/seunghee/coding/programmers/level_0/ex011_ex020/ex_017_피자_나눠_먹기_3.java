package seunghee.coding.programmers.level_0.ex011_ex020;

/*
 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
 * 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
 * n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
 * 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 */
public class ex_017_피자_나눠_먹기_3 {
	// 입력
	public static void main(String[] args) {
		print(solution(6));		// 1
		print(solution(10));		// 5
		print(solution(4));		// 2
	}
	// 연산
	public static int solution(int n) {
		for(int i=1; i<n; i++) {
			if(i*6%n==0) return i;
		}
		return n;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
