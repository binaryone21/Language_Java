package seunghee.coding.programmers.level_0;

/*
 * 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다.
 * 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후,
 * 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
 *
 * 이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
 * 정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때,
 * 완성될 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class _06_무작위로_K개의_수_뽑기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {0, 1, 1, 2, 2, 3}, 3));
		print(solution(new int[] {0, 1, 1, 1, 1}, 4));
	}

	// 연산
	public static int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		LinkedList<Integer> arrDistinct = new LinkedList<>();
		for(int i : arr) {
			if(!arrDistinct.contains(i)) {
				arrDistinct.add(i);
			}
		}
		for(int i=0; i<k; i++) {
			answer[i] = -1;
		}
		for(int i=0; i<Math.min(arrDistinct.size(), k); i++) {
			answer[i] = arrDistinct.get(i);
		}
		return answer;

		/*
		int[] arrDistinct = Arrays.stream(arr).distinct().toArray();
		System.arraycopy(arrDistinct, 0, answer, 0, Math.min(arrDistinct.length, k));
		for(int i = arrDistinct.length; i<k; i++) {
			answer[i] = -1;
		}
		*/
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
