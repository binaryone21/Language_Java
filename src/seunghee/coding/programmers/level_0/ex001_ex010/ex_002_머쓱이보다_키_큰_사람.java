package seunghee.coding.programmers.level_0.ex001_ex010;

/*
 * 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
 * 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
 * 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 */
public class ex_002_머쓱이보다_키_큰_사람 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {149, 180, 192, 170}, 167));	// 3
		print(solution(new int[] {180, 120, 140}, 190));			// 0
	}

	// 연산
	public static int solution(int[] array, int height) {
		int count = 0;
		for(int i : array) {
			if(i > height) 	count++;
		}
		return count;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
