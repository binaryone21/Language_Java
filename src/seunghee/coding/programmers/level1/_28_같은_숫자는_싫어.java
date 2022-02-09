package seunghee.coding.programmers.level1;
/*
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 * 예를 들면, arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 * arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고
 * 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 */
import java.util.ArrayList;

public class _28_같은_숫자는_싫어 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(new int[] {1, 1, 3, 3, 0, 1, 1}));
		print(solution(new int[] {4, 4, 4, 3, 3}));
	}
	
	// 연산
	public static int[] solution(int[] arr) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if((i != 0) && (arr[i-1] == arr[i])) {
				continue;
			}
			numList.add(arr[i]);
		}
		
		int[] answer = numList.stream().mapToInt(i->i).toArray();
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
