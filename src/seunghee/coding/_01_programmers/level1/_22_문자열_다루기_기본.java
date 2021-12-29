package seunghee.coding._01_programmers.level1;
/*
 * 문자열 s의 길이가 4 혹은 6이고,
 * 숫자로만 구성돼있는지 확인해주는 함수,
 * solution을 완성하세요.
 * 예를 들어 s가 "a234"이면 False를 리턴하고
 * "1234"라면 True를 리턴하면 됩니다.
 */
public class _22_문자열_다루기_기본 {
	public static void main(String[] args) {
		
		// 입력
		print(solution("a234"));
		print(solution("1234"));
	}
	
	// 연산
	public static boolean solution(String str) {
		String check = "[0-9]{3,4}";
		if(str.matches(check)) {
			return true;
		}
		
		return false;
	}
	
	// 출력
	public static void print(boolean answer) {
		System.out.println(answer);
	}
}
