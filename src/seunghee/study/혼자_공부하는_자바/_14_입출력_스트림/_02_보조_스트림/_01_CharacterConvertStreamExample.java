package seunghee.study.혼자_공부하는_자바._14_입출력_스트림._02_보조_스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class _01_CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream(_00_FilePath.path + "/01_text.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream(_00_FilePath.path + "/01_text.txt");
		Reader reader = new InputStreamReader(fis);
		char[] chs = new char[100];
		int datas = reader.read(chs);
		String str = new String(chs, 0, datas);
		reader.close();
		return str;
	}
}
