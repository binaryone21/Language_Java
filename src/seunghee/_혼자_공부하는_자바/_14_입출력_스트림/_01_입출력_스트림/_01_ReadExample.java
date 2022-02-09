package seunghee._혼자_공부하는_자바._14_입출력_스트림._01_입출력_스트림;

import java.io.FileInputStream;
import java.io.InputStream;

@SuppressWarnings("resource")
public class _01_ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream(_00_FilePath.path + "/01_text.txt");
		
		while(true) {
			int data = is.read();
			if(data == -1) { break; }
			System.out.println(data);
		}
		
		is.close();
	}
}
