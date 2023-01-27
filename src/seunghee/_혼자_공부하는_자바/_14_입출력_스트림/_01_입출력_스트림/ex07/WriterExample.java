package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex07;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter(FilePath.path + "/ex07/text.txt");
		
		String str = "ABC";

		wr.write(str);
		
		wr.flush();
		wr.close();
	}
}
