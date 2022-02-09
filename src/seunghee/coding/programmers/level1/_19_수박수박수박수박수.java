package seunghee.coding.programmers.level1;
/*
 * 길이가 n이고, "수박수박수박수...."와 같은
 * 패턴을 유지하는 문자열을 리턴하는 함수,
 * solution을 완성하세요.
 * 예를들어 n이 4이면 "수박수박"을 리턴하고
 * 3이라면 "수박수"를 리턴하면 됩니다.
 */
public class _19_수박수박수박수박수 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(3));
		print(solution(4));
	}
	
	// 연산
	public static String solution(int num) {
		StringBuilder answer = new StringBuilder();
		
		answer.append("\"");
		for(int i=0; i<num; i++) {
			if(i%2 == 0) {
				answer.append("수");
			} else {
				answer.append("박");
			}
		}
		answer.append("\"");

		return answer.toString();
	}
	
	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
