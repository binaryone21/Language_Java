package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex04;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader(FilePath.path + "/ex04/text.txt");
		
		while(true) {
			int data = rd.read();
			if(data == -1) { break; }
			System.out.println((char)data);
		}
		
		rd.close();
	}
}
