package seunghee.coding.programmers.level_1;
/*
 * 문자열 s에 나타나는 문자를
 * 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수,
 * solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며,
 * 대문자는 소문자보다 작은 것으로 간주합니다.
 */
public class _23_문자열_내림차순으로_배치하기 {

	// 입력
	public static void main(String[] args) {
		print(solution("Zbcdefg"));
	}
	
	// 연산
	public static String solution(String str) {
		
		String[] ss = str.split("");
		int[] arr = new int[ss.length];
		for(int i=0; i<ss.length; i++) {
			arr[i] = (int)ss[i].charAt(0);
		}
		
		for(int i=0; i<arr.length-1; i++) {
			int check = arr[i];
			int k = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[k] < arr[j]) {
					k = j;
					check = arr[k];
				}
			}
			arr[k] = arr[i];
			arr[i] = check;
		}
		
		StringBuilder answer = new StringBuilder();
		for(int i=0; i<ss.length; i++) {
			answer.append((char)arr[i]);
		}
		
		return answer.toString();
	}
	
	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}
