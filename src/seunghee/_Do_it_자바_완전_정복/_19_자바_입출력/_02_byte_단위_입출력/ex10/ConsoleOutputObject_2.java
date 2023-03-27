package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex10;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class ConsoleOutputObject_2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;

		// n-type 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os.write(byteArray1);
		os.write('\n');
		os.flush();

		// n-type 단위 쓰기(byte[]의 offset 부터 length 개의 byte 데이터를 쓰기)
		byte[] byteArray2 = "반갑습니다".getBytes(Charset.defaultCharset());
		os.write(byteArray2, 6, 6);
		os.flush();
	}
}
