package seunghee.coding.programmers.level_0_5;

/*
 * 정수 배열 arr가 주어집니다.
 * arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
 * 50보다 작은 홀수라면 2를 곱합니다.
 * 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.Arrays;

public class _29_조건에_맞게_수열_변환하기_1 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 100, 99, 98}));
	}

	// 연산
	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		for(int i=0; i<answer.length; i++) {
			if(arr[i] >= 50 && arr[i]%2==0) {
				arr[i] /= 2;
			} else if(arr[i] < 50 && arr[i]%2==1) {
				arr[i] *= 2;
			}
			answer[i] = arr[i];
		}
		return answer;
	}

	// 출력
	public static void print(int[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
