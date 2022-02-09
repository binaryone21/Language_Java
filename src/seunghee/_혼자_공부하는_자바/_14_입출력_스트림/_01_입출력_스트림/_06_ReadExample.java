package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileReader;
import java.io.Reader;

@SuppressWarnings("resource")
public class _06_ReadExample {
	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader(_00_FilePath.path + "/06_text.txt");
		
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
