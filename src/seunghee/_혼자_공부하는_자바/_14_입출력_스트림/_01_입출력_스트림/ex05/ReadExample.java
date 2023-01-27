package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex05;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader(FilePath.path + "/ex05/text.txt");
		
		char[] chs = new char[100];
		
		while(true) {
			int datas = rd.read(chs);
			if(datas == -1) { break; }
			for(int i=0; i<datas; i++) {
				System.out.println(chs[i]);
			}
		}
		
		rd.close();
	}
}
