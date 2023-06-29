package seunghee.coding.programmers.level_0;

/*
 * 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
 * arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
 * arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을
 * return 하는 solution 함수를 작성해 주세요.
 */
import java.util.Arrays;

public class _02_배열의_길이에_따른_다른_연산하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {49, 12, 100, 276, 33}, 27));
		print(solution(new int[] {444, 555, 666, 777}, 100));
	}

	// 연산
	public static int[] solution(int[] arr, int n) {
		int j = arr.length%2;
		for(int i=0; i<arr.length; i++) {
			if((i+j)%2 == 1) {
				arr[i] += n;
			}
		}
		return arr;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
