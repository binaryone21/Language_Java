package seunghee.study.Do_It_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란;

public class _05_ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1,  0, array2, 1, 4);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
