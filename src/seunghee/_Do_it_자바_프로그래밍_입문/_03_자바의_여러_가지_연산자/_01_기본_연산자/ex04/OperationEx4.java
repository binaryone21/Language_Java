package seunghee._Do_it_자바_프로그래밍_입문._03_자바의_여러_가지_연산자._01_기본_연산자.ex04;

public class OperationEx4 {
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
	}
}
