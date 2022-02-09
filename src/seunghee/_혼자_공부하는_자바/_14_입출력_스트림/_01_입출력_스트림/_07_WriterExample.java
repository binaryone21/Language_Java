package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileWriter;
import java.io.Writer;

public class _07_WriterExample {
	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter(_00_FilePath.path + "/07_text.txt");
		
		String str = "ABC";

		wr.write(str);
		
		wr.flush();
		wr.close();
	}
}
