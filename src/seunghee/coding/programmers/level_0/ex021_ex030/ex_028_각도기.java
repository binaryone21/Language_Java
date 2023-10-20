package seunghee.coding.programmers.level_0.ex021_ex030;

/*
 * 각에서 0도 초과 90도 미만은 예각, 90도는 직각,
 * 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
 * 각 angle이 매개변수로 주어질 때
 * 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를
 * return하도록 solution 함수를 완성해주세요.
 */
public class ex_028_각도기 {
	// 입력
	public static void main(String[] args) {
		print(solution(70));		// 1
		print(solution(91));		// 3
		print(solution(180));		// 4
	}


	// 연산
	public static int solution(int angle) {
		if(angle<90) {
			return 1;
		} else if (angle == 90) {
			return 2;
		} else if (angle < 180) {
			return 3;
		} else {
			return 4;
		}
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
