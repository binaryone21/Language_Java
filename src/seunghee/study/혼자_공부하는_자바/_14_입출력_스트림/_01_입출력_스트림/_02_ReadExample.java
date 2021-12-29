package seunghee.study.혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileInputStream;
import java.io.InputStream;

@SuppressWarnings("resource")
public class _02_ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream(_00_FilePath.path + "/03_text.txt");
		
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
