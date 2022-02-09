package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

import java.io.IOException;

public class _09_KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}
