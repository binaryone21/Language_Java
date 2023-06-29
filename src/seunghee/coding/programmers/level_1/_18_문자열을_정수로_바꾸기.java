package seunghee.coding.programmers.level_1;
/*
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수,
 * solution을 완성하세요.
 */
public class _18_문자열을_정수로_바꾸기 {

	// 입력
	public static void main(String[] args) {
		print(solution("1234"));
	}
	
	// 연산
	public static int solution(String str) {
		int answer = 0;
		
		String ss = str.substring(0, 1);
		switch(ss) {
			case "+" : answer = Integer.parseInt(str.substring(1, str.length())); break;
			case "-" : answer = 0 - Integer.parseInt(str.substring(1, str.length())); break;
			default : answer = Integer.parseInt(str); break;
		}
		
		return answer;
	}
	
	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
