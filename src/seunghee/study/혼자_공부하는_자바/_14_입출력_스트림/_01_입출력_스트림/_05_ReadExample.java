package seunghee.study.혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileReader;
import java.io.Reader;

@SuppressWarnings("resource")
public class _05_ReadExample {
	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader(_00_FilePath.path + "/05_text.txt");
		
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
