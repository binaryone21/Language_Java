package seunghee._Do_it_자바_완전_정복._19_자바_입출력._03_char_단위_입출력.ex02;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.*;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		// 파일 객체 생성
		File readerWriterFile = new File(FilePath.path + "/_03_char_단위_입출력/ex02/BufferedFile.txt");

		// 1. FileWriter 를 이용한 파일 쓰기(UTF-8 모드)
		try(Writer writer = new FileWriter(readerWriterFile);
			BufferedWriter bw = new BufferedWriter(writer)) {
			bw.write("안녕하세요\n".toCharArray());
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다.", 2, 3);
			bw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}

		// 2. FileReader 를 이용한 파일 읽기(UTF-8 모드)
		try(Reader reader = new FileReader(readerWriterFile);
			BufferedReader br = new BufferedReader(reader)) {
			String data;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
