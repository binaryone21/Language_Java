package seunghee.study.혼자_공부하는_자바._05_참조_타입._02_배열;

public class _08_ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "arrray", "copy"};
		String [] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i]+", ");
		}
	}
}
