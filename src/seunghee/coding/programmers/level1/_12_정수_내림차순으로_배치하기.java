package seunghee.coding.programmers.level1;
/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
public class _12_정수_내림차순으로_배치하기 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(118372));
	}
	
	// 연산
	public static long solution(long num) {
		long[] arr = new long[(int) (Math.log10(num)+1)];
		for(int i=0; i<arr.length; i++) {
			arr[i] = num%10;
			num /= 10;
		}
		
		for(int i=0; i<arr.length-1; i++) {
			long check = arr[i];
			int k=i;
			for(int j=i+1; j<arr.length; j++) {
				if(check < arr[j]) {
					k=j;
					check = arr[k];
				}
			}
			arr[k] = arr[i];
			arr[i] = check;
		}
		
		long answer = 0L;
		for(int i=0; i<arr.length; i++) {
			answer = (answer*10) + arr[i];
		}
		
		return answer;
	}
	
	// 출력
	public static void print(long answer) {
		System.out.println(answer);
	}
}
