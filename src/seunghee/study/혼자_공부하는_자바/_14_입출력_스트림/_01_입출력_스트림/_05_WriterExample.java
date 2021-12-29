package seunghee.study.혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileWriter;
import java.io.Writer;

public class _05_WriterExample {
	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter(_00_FilePath.path + "/05_text.txt");
		
		char[] chs = {'A', 'B', 'C'};

		wr.write(chs);
		
		wr.flush();
		wr.close();
	}
}
