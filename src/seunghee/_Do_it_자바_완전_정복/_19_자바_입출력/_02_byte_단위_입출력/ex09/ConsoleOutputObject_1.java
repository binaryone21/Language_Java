package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex09;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;

		// 1. 1-byte 단위 쓰기
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		os.flush();

		// 2. N-byte 단위 쓰기 (byte[]의 처음부터 끝까지 데이터 쓰기)
		byte[] byteArray1 = "Hello!".getBytes();
		os.write(byteArray1);
		os.write('\n');
		os.flush();

		// 3. N-byte 단위 쓰기 (byte[]의 offset 부터 length 개의 byte 데이터를 쓰기)
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os.write(byteArray2, 7, 8);
		os.flush();
	}
}
