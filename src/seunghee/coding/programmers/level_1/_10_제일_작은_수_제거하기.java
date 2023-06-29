package seunghee.coding.programmers.level_1;
/*
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
 * solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고,
 * [10]면 [-1]을 리턴 합니다.
 */
import java.util.Arrays;

public class _10_제일_작은_수_제거하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {4, 3, 2, 1}));
		print(solution(new int[] {10}));
	}
	
	// 연산
	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length-1];
		if(arr.length == 1) {
			return (new int[] {-1});
		}
		
		int j = 0;	// 가장 작은 숫자가 있는 번호
		for(int i=0; i<arr.length; i++) {
			if(arr[j] > arr[i]) {
				j = i;
			}
		}
		
		for(int i=0, k=0; k<answer.length; i++) {
			if(i == j) {
				continue;
			}
			answer[k] = arr[i];
			k++;
		}
		
		return answer;
	}
	
	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
