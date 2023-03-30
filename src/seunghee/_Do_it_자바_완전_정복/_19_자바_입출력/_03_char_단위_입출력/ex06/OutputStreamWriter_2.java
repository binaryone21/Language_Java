package seunghee._Do_it_자바_완전_정복._19_자바_입출력._03_char_단위_입출력.ex06;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class OutputStreamWriter_2 {
	public static void main(String[] args) {
		// 1. 콘솔 출력 1(기본값 : UTF-8 -> UTF-8)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter를 이용한\n".toCharArray());
			osw.write("콘솔 출력 예제입니다. \n 한글과 영문이 모두 포함돼 있습니다.");
			osw.write("\n");
			osw.write("Good Bye!!!\n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		// 2. 콘솔 출력 2(기본값 : UTF-8 -> MS949)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter를 이용한\n".toCharArray());
			osw.write("콘솔 출력 예제입니다. \n 한글과 영문이 모두 포함돼 있습니다.");
			osw.write("\n");
			osw.write("Good Bye!!!\n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
