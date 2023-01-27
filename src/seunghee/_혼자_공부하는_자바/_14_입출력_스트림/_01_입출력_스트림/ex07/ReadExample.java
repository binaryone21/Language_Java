package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex07;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader(FilePath.path + "/ex07/text.txt");
		StringBuilder sb = new StringBuilder();

		while(true) {
			int data = rd.read();
			if(data == -1) { break; }
			sb.append((char)data);
		}
		System.out.println(sb.toString());
		
		rd.close();
	}
}
