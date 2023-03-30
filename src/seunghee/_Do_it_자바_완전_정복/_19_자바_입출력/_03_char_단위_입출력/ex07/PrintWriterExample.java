package seunghee._Do_it_자바_완전_정복._19_자바_입출력._03_char_단위_입출력.ex07;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.*;

public class PrintWriterExample {
	public static void main(String[] args) {
		// 파일 객체 생성
		File printWriter1 = new File(FilePath.path + "/_03_char_단위_입출력/ex07/printWriter1.txt");
		File printWriter2 = new File(FilePath.path + "/_03_char_단위_입출력/ex07/printWriter2.txt");
		File printWriter3 = new File(FilePath.path + "/_03_char_단위_입출력/ex07/printWriter3.txt");

		// 1. PrintWriter(File file)
		try(PrintWriter pw = new PrintWriter(printWriter1)) {
			pw.println("PrintWriter 예제#1");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 2. PrintWriter(OutputStream os)
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(printWriter2))) {
			pw.println("PrintWriter 예제#2");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 3. PrintWriter(Writer w)
		try(PrintWriter pw = new PrintWriter(new FileWriter(printWriter3))) {
			pw.println("PrintWriter 예제#3");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 4. PrintWriter(System.out)
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("PrintWriter 예제#4");
		pw.println(13);
		pw.println(5.8);
		pw.print("안녕하세요! ");
		pw.println("반갑습니다.");
		pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
	}
}
