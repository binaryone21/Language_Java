package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex06;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter(FilePath.path + "/ex06/text.txt");
		
		char[] chs = {'A', 'B', 'C', 'D', 'E'};

		wr.write(chs, 1, 3);
		
		wr.flush();
		wr.close();
	}
}
