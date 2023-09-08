package seunghee.coding.programmers.level_0;

/*
 * 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다.
 * 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
 *
 * 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
 * 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a^2 + b^2 + c^2 )점을 얻습니다.
 * 세 숫자가 모두 같다면 (a + b + c) × (a^2 + b^2 + c^2 ) × (a^3 + b^3 + c^3 )점을 얻습니다.
 * 세 정수 a, b, c가 매개변수로 주어질 때,
 * 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.HashSet;

public class _77_주사위_게임_2 {
	// 입력
	public static void main(String[] args) {
		print(solution(2, 6, 1));	// 9
		print(solution(5, 3, 3));	// 473
		print(solution(4, 4, 4));	// 110592
	}

	// 연산
	public static int solution(int a, int b, int c) {
		HashSet<Integer> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		int multi = 1;
		System.out.println("time" + set.size());
		for(int i=1; i<=4-set.size(); i++) {
			multi *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
		}
		return multi;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
