package seunghee._Do_it_자바_완전_정복._19_자바_입출력._03_char_단위_입출력.ex03;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.*;

public class InputStreamReader_1 {
	public static void main(String[] args) {
		// 파일 객체 생성
		File inputStreamReader = new File(FilePath.path + "/_03_char_단위_입출력/ex03/InputStreamReader.txt");

		// 1. FileReader 를 이용한 파일 읽기
		try(Reader reader = new FileReader(inputStreamReader)) {
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		// 2. FileInputStream + InputStreamReader 를 이용한 파일 읽기
		try(InputStream is = new FileInputStream(inputStreamReader);
			InputStreamReader isr = new InputStreamReader(is, "MS949");) {
			int data;
			while((data = isr.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println("\n" + isr.getEncoding());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
