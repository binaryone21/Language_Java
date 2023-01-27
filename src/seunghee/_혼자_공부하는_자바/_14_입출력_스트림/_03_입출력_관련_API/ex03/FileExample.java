package seunghee._혼자_공부하는_자바._14_입출력_스트림._03_입출력_관련_API.ex03;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._03_입출력_관련_API.FilePath;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File(FilePath.path + "/ex03/file");
		File file1 = new File(FilePath.path + "/ex03/file/text1.txt");
		File file2 = new File(FilePath.path + "/ex03/file/text2.txt");
		File file3 = new File(FilePath.path + "/ex03/file/text3.txt");
		
		if(dir.exists() == false) { dir.mkdirs(); }
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File(FilePath.path);
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t\t크기\t이름");
		System.out.println("--------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}
