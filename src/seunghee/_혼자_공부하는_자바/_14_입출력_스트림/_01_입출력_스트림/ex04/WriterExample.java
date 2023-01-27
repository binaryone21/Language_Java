package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex04;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter(FilePath.path + "/ex04/text.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';

		wr.write(a);
		wr.write(b);
		wr.write(c);
		
		wr.flush();
		wr.close();
	}
}
