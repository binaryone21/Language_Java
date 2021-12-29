package seunghee.coding._01_programmers.level1;
/*
 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
 * "김서방은 x에 있다"는 String을 반환하는 함수,
 * solution을 완성하세요.
 * seoul에 "Kim"은 오직 한 번만 나타나며
 * 잘못된 값이 입력되는 경우는 없습니다.
 */
public class _21_서울에서_김서방_찾기 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(new String[] {"Jane", "Kim"}));
	}
		
	// 연산
	public static String solution(String[] str) {
		StringBuilder answer = new StringBuilder();
		answer.append("김서방은 ");
			
		for(int i=0; i<str.length; i++) {
			if(str[i].equals("Kim")) {
				answer.append(i);
				break;
			}
		}
		
		answer.append("에 있다");
		return answer.toString();
	}
		
	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
