package seunghee.coding.programmers.level1;
/*
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로,
 * 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수,
 * solution을 완성하세요.
 */
public class _15_이상한_문자_만들기 {

	// 입력
	public static void main(String[] args) {
		print(solution("try hello world"));
	}
	
	// 연산
	public static String solution(String str) {
		StringBuilder answer = new StringBuilder();
		String[] ss = str.split("");
		
		int count = 0;
		answer.append("\"");
		for(int i=0; i<str.length(); i++) {
			if(ss[i].equals(" ")) {
				count = 0;
			} else {
				if(count%2 == 0) {
					ss[i] = ss[i].toUpperCase(); 
				} else if(count%2 != 0) {
					ss[i] = ss[i].toLowerCase(); 
				}
				count++;
			}
			answer.append(ss[i]);
		}
		answer.append("\"");
		
		return answer.toString();
	}
	
	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
