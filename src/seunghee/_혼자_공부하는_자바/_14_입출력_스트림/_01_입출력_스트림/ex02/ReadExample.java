package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex02;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream(FilePath.path + "/ex02/text.txt");
		
		byte[] bs = new byte[100];
		
		while(true) {
			int datas = is.read(bs);
			if(datas == -1) { break; }
			for(int i=0; i<datas; i++) {
				System.out.println(bs[i]);
			}
		}
		
		is.close();
	}
}
