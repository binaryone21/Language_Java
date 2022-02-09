package seunghee._혼자_공부하는_자바._03_연산자._02_연산자의_종류;

public class _09_LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요");
		}
		
		if((charCode >=97) && (charCode<=122)) {
			System.out.println("소문자군요");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0 ~ 9 숫자군요");
		}
		
		int value = 6;
		
		if((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
 	}
}
