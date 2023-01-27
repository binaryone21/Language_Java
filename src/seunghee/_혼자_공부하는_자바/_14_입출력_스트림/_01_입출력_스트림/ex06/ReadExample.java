package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex06;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader(FilePath.path + "/ex06/text.txt");
		
		char[] chs = new char[5];
		
		int datas = rd.read(chs, 1, 3);
		
		if(datas != -1) {
			for(int i=0; i<chs.length; i++) {
				System.out.print(chs[i]);
			}
		}
		
		rd.close();
	}
}
