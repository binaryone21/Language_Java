package seunghee._Do_it_자바_완전_정복._19_자바_입출력._03_char_단위_입출력.ex04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {
	public static void main(String[] args) {
		// 콘솔로 입력 (UTF-8)
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			int data;
			while((data = isr.read()) != '\n') {
				System.out.print((char) data);
			}
			System.out.println("\n" + isr.getEncoding());
		} catch(IOException e) {
			e.printStackTrace();
		}

		// 콘솔로 입력(MS949)
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			int data;
			while((data = isr.read()) != '\n') {
				System.out.print((char) data);
			}
			System.out.println("\n" + isr.getEncoding());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
