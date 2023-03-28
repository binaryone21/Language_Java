package seunghee._Do_it_자바_완전_정복._19_자바_입출력._03_char_단위_입출력.ex01;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.*;

public class FileReaderWriter {
	public static void main(String[] args) {
		// 파일 객체 생성
		File readerWriterFile = new File(FilePath.path + "/_03_char_단위_입출력/ex01/readerWriterFile.txt");

		// 1. FileWriter 를 이용한 파일 쓰기(UTF-8 모드)
		try(Writer writer = new FileWriter(readerWriterFile)) {
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello");
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다.", 2, 3);
			writer.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}

		// 2. FileReader 를 이용한 파일 읽기(UTF-8 모드)
		try(Reader reader = new FileReader(readerWriterFile)) {
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
