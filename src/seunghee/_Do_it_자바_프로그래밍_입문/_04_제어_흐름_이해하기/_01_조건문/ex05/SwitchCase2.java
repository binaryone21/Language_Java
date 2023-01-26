package seunghee._Do_it_자바_프로그래밍_입문._04_제어_흐름_이해하기._01_조건문.ex05;

public class SwitchCase2 {
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
			case "Gold" : System.out.println("금메달입니다.");
				break;
			case "Silver" : System.out.println("은메달입니다.");
				break;
			case "Bronze" : System.out.println("동메달입니다.");
				break;
			default : System.out.println("메달이 없습니다.");
				break;
		}		
	}
}
