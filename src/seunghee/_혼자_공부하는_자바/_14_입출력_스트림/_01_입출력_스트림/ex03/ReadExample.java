package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.ex03;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림.FilePath;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream(FilePath.path + "/ex03/text.txt");
		
		byte[] bs = new byte[5];
		
		int datas = is.read(bs, 2, 2);
		
		if(datas != -1) { 
			for(int i=0; i<bs.length; i++) {
				System.out.println(bs[i]);
			}
		}
		
		is.close();
	}
}
