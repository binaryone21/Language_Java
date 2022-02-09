package seunghee.coding.programmers.level1;
/* 
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
 * 다르면 False를 return 하는 solution를 완성하세요.
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
 * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 예를 들어 s가 "pPoooyY"면 true를 return하고
 * "Pyy"라면 false를 return합니다.
 */
public class _24_문자열_내_p와_y의_개수 {
	public static void main(String[] args) {
		
		// 입력
		print(solution("pPoooyY"));
		print(solution("Pyy"));
	}
	
	// 연산
	public static boolean solution(String str) {
		char[] ch = str.toCharArray();
		int pp = 0;
		int yy = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == 'p' || ch[i] == 'P') {
				pp++;
			} else if(ch[i] == 'y' || ch[i] == 'Y'){
				yy++;
			}
		}
		
		return pp == yy;
	}
	
	// 출력
	public static void print(boolean answer) {
		System.out.println(answer);
	}
}
