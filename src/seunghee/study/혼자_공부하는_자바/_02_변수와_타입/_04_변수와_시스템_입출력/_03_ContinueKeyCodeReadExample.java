package seunghee.study.혼자_공부하는_자바._02_변수와_타입._04_변수와_시스템_입출력;

import java.io.IOException;

public class _03_ContinueKeyCodeReadExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : "+keyCode);
		}
	}
}
