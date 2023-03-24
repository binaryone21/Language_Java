package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex04;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		// 입력 파일 생성
		File outFile = new File(FilePath.path + "/_02_byte_단위_입출력/ex04/FileOutputStream1.txt");
		if(!outFile.exists())
			outFile.createNewFile();

		// 1. 1-byte 단위 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');
		os1.write('\n');
		os1.flush();
		os1.close();

		// 2. n=byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true);
		byte[] byteArray1 = "Hello".getBytes();
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();

		// 3. n-byte 단위 쓰기(byte[]의 offset 위치에서부터 length 개수를 읽어 출력
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "Better the last smile than the first laughter.".getBytes();
		os3.write(byteArray2, 7, 8);
		os3.flush();
		os3.close();
	}
}
