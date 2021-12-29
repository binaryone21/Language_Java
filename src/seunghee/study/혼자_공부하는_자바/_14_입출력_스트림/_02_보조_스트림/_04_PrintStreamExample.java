package seunghee.study.혼자_공부하는_자바._14_입출력_스트림._02_보조_스트림;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class _04_PrintStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream(_00_FilePath.path + "/04_text.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
	}
}
