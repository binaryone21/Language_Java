package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileReader;
import java.io.Reader;

@SuppressWarnings("resource")
public class _04_ReadExample {
	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader(_00_FilePath.path + "/04_text.txt");
		
		while(true) {
			int data = rd.read();
			if(data == -1) { break; }
			System.out.println((char)data);
		}
		
		rd.close();
	}
}
