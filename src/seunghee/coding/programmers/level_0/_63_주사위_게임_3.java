package seunghee.coding.programmers.level_0;

/*
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다.
 * 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 *
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점을 얻습니다.
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때,
 * 얻는 점수를 return 하는 solution 함수를 작성해 주세요.


 */

public class _63_주사위_게임_3 {
	// 입력
	public static void main(String[] args) {
		print(solution(2, 2, 2, 2));	// 2222
		print(solution(4, 1, 4, 4));	// 1681
		print(solution(6, 3, 3, 6));	// 27
		print(solution(2, 5, 2, 6));	// 30
		print(solution(6, 4, 2, 5));	// 2
	}

	// 연산
	public static int solution(int a, int b, int c, int d) {
		int[] dice = new int[7];
		dice[a]++;
		dice[b]++;
		dice[c]++;
		dice[d]++;
		int max = 0;
		int maxIndex = -1;
		int min = 4;
		int minIndex = -1;
		for(int i=1; i<dice.length; i++) {
			if(dice[i] == 0) continue;
			if(max < dice[i]) {
				max = dice[i];
				maxIndex = i;
			}
			if(min > dice[i]) {
				min = dice[i];
				minIndex = i;
			}
		}
		switch (max) {
			case 4 : return maxIndex*1111;
			case 3 : return (int) Math.pow((maxIndex*10 + minIndex), 2);
			case 1 : return Math.min(Math.min(a, b), Math.min(c, d));
			default : for(int i=0; i<dice.length; i++) {
							if(dice[i] == min && i != minIndex) {
								return (max == min)
											? (i + minIndex) * Math.abs(i - minIndex)
											: i * minIndex;
							}
						}
		}
		return -1;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
