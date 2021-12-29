package seunghee.study.혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileWriter;
import java.io.Writer;

public class _04_WriterExample {
	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter(_00_FilePath.path + "/04_text.txt");
		
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
