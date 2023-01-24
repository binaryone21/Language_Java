package seunghee._혼자_공부하는_자바._02_변수와_타입._04_변수와_시스템_입출력.ex02;

import java.io.IOException;

public class KeyCodeExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : "+ keyCode);
	}
}
