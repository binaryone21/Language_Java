package seunghee.coding.programmers.level_1;
/*
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행,
 * 같은 열의 값을 서로 더한 결과가 됩니다.
 * 2개의 행렬 arr1과 arr2를 입력받아,
 * 행렬 덧셈의 결과를 반환하는 함수,
 * solution을 완성해주세요.
 */
import java.util.Arrays;

public class _03_행렬의_덧셈 {

	// 입력
	public static void main(String[] args) {
		print(solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}}));
		print(solution(new int[][] {{1},{2}}, new int[][] {{3},{4}}));
	}
	
	// 연산
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return answer;
	}
	
	// 출력
	public static void print(int[][] answer) {
		System.out.println(Arrays.deepToString(answer));
	}
}
