package seunghee._혼자_공부하는_자바._04_조건문과_반복문._01_조건문_if문_switch문;

public class _08_SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
			case "부장" : System.out.println("700만원"); break;
			case "과장" : System.out.println("500만원"); break;
			default : System.out.println("300만원");
		}
	}
}
