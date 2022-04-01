package seunghee.coding.programmers.level1;
/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
 * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
 * "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수,
 * solution을 완성해 보세요.
 */
public class _17_시저_암호 {

	// 입력
	public static void main(String[] args) {
		print(solution("AB", 1));
		print(solution("z", 1));
		print(solution("a B z", 4));
	}
	
	// 연산
	public static String solution(String str, int num) {
		StringBuilder answer = new StringBuilder();
		
		answer.append("\"");
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if((int)ch != 32) {
				int lORs = (int)ch/32;
				int text = (((int)ch%32)+num-1)%26+1;
				ch = (char)(lORs*32 + text);
			}
			answer.append(ch);
		}
		answer.append("\"");
		
		return answer.toString();
	}
	
	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
	
	
}
