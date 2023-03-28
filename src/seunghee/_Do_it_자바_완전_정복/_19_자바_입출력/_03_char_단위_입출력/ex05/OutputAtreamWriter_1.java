package seunghee._Do_it_자바_완전_정복._19_자바_입출력._03_char_단위_입출력.ex05;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.*;

public class OutputAtreamWriter_1 {
	public static void main(String[] args) {
		// 1. FileWriter 를 이용해 데이터 쓰기(기본값 (UTF-8))
		File outputStreamWriter1 = new File(FilePath.path + "/_03_char_단위_입출력/ex05/OutputStreamWriter1.txt");
		try(Writer writer = new FileWriter(outputStreamWriter1);) {
			writer.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			writer.write("한글과 영문이 모두 포함돼 있습니다.");
			writer.write('\n');
			writer.write("Good Bye!!!\n\n");
			writer.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}

		// 2. FileWriter 이용해 데이터 쓰기(기본값 (UTF-8) -> MS949 파일 생성)
		File outputStreamWriter2 = new File(FilePath.path + "/_03_char_단위_입출력/ex05/OutputStreamWriter2.txt");
		try(OutputStream os = new FileOutputStream(outputStreamWriter2, false);
			OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");) {
			osw.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			osw.write("한글과 영문이 모두 포함돼 있습니다.");
			osw.write('\n');
			osw.write("Good Bye!!!\n\n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
}
