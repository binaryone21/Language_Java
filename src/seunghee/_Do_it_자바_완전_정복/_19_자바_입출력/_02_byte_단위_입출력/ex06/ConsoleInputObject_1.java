package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex06;

import java.io.*;

public class ConsoleInputObject_1 {
	public static void main(String[] args) throws IOException {
		// InputStream 객체 생성
		InputStream is = System.in;
		int data;
		while((data = is.read()) != '\r') {
			System.out.println("읽은 데이터 : " + (char) data + " 남은 바이트 수 : " + is.available());
		}
		System.out.println(data);
		System.out.println(is.read());
	}
}
