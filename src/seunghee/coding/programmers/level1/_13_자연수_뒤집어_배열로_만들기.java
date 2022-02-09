package seunghee.coding.programmers.level1;
/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
public class _13_자연수_뒤집어_배열로_만들기 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(12345));
	}
	
	// 연산
	public static int[] solution(long num) {
		int[] answer = new int[(int) (Math.log10(num)+1)];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)(num%10);
			num /= 10;
		}		
		return answer;
	}
	
	// 출력
	public static void print(int[] answer) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<answer.length; i++) {
			sb.append(answer[i]);
			if(i != answer.length -1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
