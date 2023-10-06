package seunghee.coding.programmers.level_0.ex021_ex030;

/*
 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
 * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
 */
public class ex_024_직각삼각형_출력하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(3));	//
	}

	// 연산
	public static String solution(int args) {
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=args; i++) {
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
