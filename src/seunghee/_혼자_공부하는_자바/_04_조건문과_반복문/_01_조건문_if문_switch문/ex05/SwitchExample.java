package seunghee._혼자_공부하는_자바._04_조건문과_반복문._01_조건문_if문_switch문.ex05;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
			case 1 : System.out.println("1번이 나왔습니다."); break; 
			case 2 : System.out.println("2번이 나왔습니다."); break; 
			case 3 : System.out.println("3번이 나왔습니다."); break; 
			case 4 : System.out.println("4번이 나왔습니다."); break; 
			case 5 : System.out.println("5번이 나왔습니다."); break; 
			default : System.out.println("6번이 나왔습니다."); break;		
		}
	}
}
