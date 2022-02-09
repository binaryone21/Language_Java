package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class _03_WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream(_00_FilePath.path + "/03_text.txt");
		
		byte[] bs = {10, 20, 30, 40, 50};
		
		os.write(bs, 2, 2);
		
		os.flush();
		os.close();
	}
}
