package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex01;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream(FilePath.path + "/ex01/text.txt");
		
		while(true) {
			int data = is.read();
			if(data == -1) { break; }
			System.out.println(data);
		}
		
		is.close();
	}
}
