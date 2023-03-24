package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex05;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream2 {
	public static void main(String[] args) throws IOException {
		// 1. 입력 파일 생성
		File outFile = new File(FilePath.path + "/_02_byte_단위_입출력/ex05/FileOutputStream2.txt");
		if(!outFile.exists())
			outFile.createNewFile();

		// 2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, false); // 덮어쓰기
		byte[] byteArray1 = "안녕하세요".getBytes();
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();

		// 3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		os3.write(byteArray2, 6, 6);
		os3.flush();
		os3.close();
	}
}
