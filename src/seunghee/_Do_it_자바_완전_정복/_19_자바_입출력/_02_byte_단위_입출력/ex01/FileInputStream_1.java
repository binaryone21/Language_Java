package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex01;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {
		// 입력 파일 생성
		File inFile = new File(FilePath.path + "/_02_byte_단위_입출력/ex01/FileInputStream1.txt");

		// InputStream 객체 생성
		InputStream is = new FileInputStream(inFile);
		int data;
		while((data = is.read()) != -1) {
			System.out.println("읽은 데이터 : " + (char)data + "남은 바이트 수 : " + is.available());
		}

		// InputStream 자원 반납
		is.close();
	}
}
