package seunghee._혼자_공부하는_자바._05_참조_타입._02_배열;

public class _07_ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+", ");
		}
	}
}
