package seunghee._혼자_공부하는_자바._04_조건문과_반복문._02_반복문_for문_while문_do_while문;

public class _05_ForMultiplicationTableExample {
	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.println("*** "+m+"단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m+" x "+n+" = "+(m*n));
			}
		}
	}
}
