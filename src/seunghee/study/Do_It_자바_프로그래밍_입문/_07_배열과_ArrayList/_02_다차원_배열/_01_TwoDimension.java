package seunghee.study.Do_It_자바_프로그래밍_입문._07_배열과_ArrayList._02_다차원_배열;

public class _01_TwoDimension {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
}
