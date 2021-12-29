package seunghee.study._5_stream_file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class _35_RandomAccessFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("text_35.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		rf.seek(0);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
