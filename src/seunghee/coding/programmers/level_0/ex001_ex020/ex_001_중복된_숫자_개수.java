package seunghee.coding.programmers.level_0.ex001_ex020;

/*
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 */
public class ex_001_중복된_숫자_개수 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 1, 2, 3, 4, 5}, 1));	// 2
		print(solution(new int[] {0, 2, 3, 4}, 1));			// 0
	}

	// 연산
	public static int solution(int[] array, int n) {
		int count = 0;
		for(int i : array) {
			if(i == n) 	count++;
		}
		return count;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
