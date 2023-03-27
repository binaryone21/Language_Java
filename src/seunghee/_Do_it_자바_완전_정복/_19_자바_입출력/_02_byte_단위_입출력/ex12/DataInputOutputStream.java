package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex12;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.*;

public class DataInputOutputStream {
	public static void main(String[] args) throws IOException {
		// 파일 생성
		File dataFile = new File(FilePath.path + "/_02_byte_단위_입출력/ex12/file1.data");

		// 데이터 쓰기(DataOutputStream)
		try(OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);) {
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		}

		// 데이터 읽기(DataInputStream)
		try(InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}
	}
}
