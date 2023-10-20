package seunghee.coding.programmers.level_0.ex021_ex030;

/*
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class ex_027_특정_문자_제거하기 {
	// 입력
	public static void main(String[] args) {
		print(solution("abcdef", "f"));		// abcde
		print(solution("BCBdbe", "B"));		// Cdbe
	}


	// 연산
	public static String solution(String my_string, String letter) {
		return my_string.replaceAll(letter, "");
	}

	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
