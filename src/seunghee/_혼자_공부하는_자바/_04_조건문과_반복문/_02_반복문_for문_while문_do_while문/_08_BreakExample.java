package seunghee._혼자_공부하는_자바._04_조건문과_반복문._02_반복문_for문_while문_do_while문;

public class _08_BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random() * 6) +1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
