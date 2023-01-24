package seunghee._혼자_공부하는_자바._04_조건문과_반복문._02_반복문_for문_while문_do_while문.ex09;

public class BreakOutterExample {
	public static void main(String[] args) {
		Outter : for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
