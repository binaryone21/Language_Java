package seunghee.coding._01_programmers.level1;
/*
 * array의 각 element 중 divisor로 나누어 떨어지는 값을
 * 오름차순으로 정렬한 배열을 반환하는 함수,
 * solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가
 * 하나도 없다면 배열에 -1을 담아 반환하세요.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class _27_나누어_떨어지는_숫자_배열 {
	public static void main(String[] args) {
		// 입력
		print(solution(new int[] {5, 9, 7, 10}, 5));
		print(solution(new int[] {2, 36, 1, 3}, 1));
		print(solution(new int[] {3, 2, 6}, 10));
	}
	
	// 연산
	public static int[] solution(int[] arr, int div) {
		int[] answer = new int[arr.length];
		
		ArrayList<Integer> divList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % div == 0) {
				divList.add(arr[i]);
			}
		}
		if(divList.size() == 0) divList.add(-1);
		
		answer = divList.stream().mapToInt(i->i).toArray();
		Arrays.sort(answer);
		return answer;
	}
	
	// 출력
	public static void print(int[] answer) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<answer.length; i++) {
			sb.append(answer[i]);
			if(i != answer.length-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
