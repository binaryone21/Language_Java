package seunghee.study.Do_It_자바_프로그래밍_입문._04_제어_흐름_이해하기._01_조건문;

public class _04_SwitchCase {
	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1 : medalColor = 'G';
					 break;
			case 2 : medalColor = 'S';
					break;
			case 3 : medalColor = 'B';
					break;
			default : medalColor = 'A';
		}
		
		System.out.println(ranking+"등 메달의 색깔은 "+medalColor+"입니다.");
	}
}