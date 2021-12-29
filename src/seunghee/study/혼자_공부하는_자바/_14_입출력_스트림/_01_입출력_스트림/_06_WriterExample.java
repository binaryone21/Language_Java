package seunghee.study.혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileWriter;
import java.io.Writer;

public class _06_WriterExample {
	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter(_00_FilePath.path + "/06_text.txt");
		
		char[] chs = {'A', 'B', 'C', 'D', 'E'};

		wr.write(chs, 1, 3);
		
		wr.flush();
		wr.close();
	}
}
