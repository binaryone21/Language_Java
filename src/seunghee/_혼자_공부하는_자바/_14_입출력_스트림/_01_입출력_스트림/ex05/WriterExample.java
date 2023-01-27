package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex05;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter(FilePath.path + "/ex05/text.txt");
		
		char[] chs = {'A', 'B', 'C'};

		wr.write(chs);
		
		wr.flush();
		wr.close();
	}
}
