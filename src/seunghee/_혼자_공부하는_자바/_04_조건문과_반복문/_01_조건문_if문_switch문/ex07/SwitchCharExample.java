package seunghee._혼자_공부하는_자바._04_조건문과_반복문._01_조건문_if문_switch문.ex07;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A' :
			case 'a' :
				System.out.println("우수 회원입니다."); break;
			case 'B' :
			case 'b' :
				System.out.println("일반 회원입니다."); break;
			default :
				System.out.println("손님입니다."); break;
		}
	}
}
