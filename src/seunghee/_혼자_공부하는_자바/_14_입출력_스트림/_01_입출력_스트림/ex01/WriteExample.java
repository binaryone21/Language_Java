package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex01;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream(FilePath.path + "/ex01/text.txt");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}
}
