package seunghee.coding.programmers.level_0_5;

/*
 * 정수로 이루어진 리스트 num_list 가 주어집니다.
 * num_list 에서 가장 작은 5개의 수를 오름차순으로 담은
 * 리스트를 return 하도록 solution 함수를 완성해주세요.
 */
import java.util.Arrays;

public class _01_뒤에서_5등까지 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {12, 4, 15, 46, 38, 1, 14}));
	}

	// 연산
	public static int[] solution(int[] num_list) {
		for(int i=0; i<num_list.length-1; i++) {
			int k = i;
			for(int j=i+1; j<num_list.length; j++) {
				if(num_list[k] > num_list[j]) {
					k = j;
				}
			}
			int sw = num_list[k];
			num_list[k] = num_list[i];
			num_list[i] = sw;
		}

		int[] answer = new int[5];
		System.arraycopy(num_list, 0, answer, 0, 5);

		return answer;

		/*
			return Arrays.stream(num_list)
				.sorted()
				.limit(5)
				.toArray();
		*/
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
