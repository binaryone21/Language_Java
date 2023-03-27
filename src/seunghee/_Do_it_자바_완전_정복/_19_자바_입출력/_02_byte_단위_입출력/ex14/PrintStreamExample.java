package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex14;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.*;

public class PrintStreamExample {
	public static void main(String[] args) throws IOException {
		// File 객체 생성
		File outFile1 = new File(FilePath.path + "/_02_byte_단위_입출력/ex14/PrintStream1.txt");
		File outFile2 = new File(FilePath.path + "/_02_byte_단위_입출력/ex14/PrintStream2.txt");

		// 1. PrintStream(FileOutputStream(File))
		try(OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);) {
			ps.println(5.8);
			ps.print(3 + " 안녕 " + 12345 + "\n");
			ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}

		// 2. PrintStream(File)
		try(PrintStream ps = new PrintStream(outFile2);) {
			ps.println(5.8);
			ps.print(3 + " 안녕 " + 12345 + "\n");
			ps.printf("%d ",7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}

		// 3. PrintStream ps = System.out
		try(OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2)) {
			ps.println(5.8);
			ps.print(3 + " 안녕 " + 12345 + "\n");
			ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}
	}
}
