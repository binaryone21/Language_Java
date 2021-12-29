package seunghee.study.혼자_공부하는_자바._04_조건문과_반복문._02_반복문_for문_while문_do_while문;

public class _10_ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
