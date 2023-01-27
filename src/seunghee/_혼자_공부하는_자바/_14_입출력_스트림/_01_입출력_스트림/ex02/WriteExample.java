package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex02;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream(FilePath.path + "/ex02/text.txt");
		
		byte[] bs = {10, 20, 30};
		
		os.write(bs);
		
		os.flush();
		os.close();
	}
}
