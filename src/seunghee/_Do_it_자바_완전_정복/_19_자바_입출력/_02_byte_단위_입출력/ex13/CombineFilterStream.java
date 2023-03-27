package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex13;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.*;

public class CombineFilterStream {
	public static void main(String[] args) throws IOException {
		// 파일 생성
		File dataFile = new File(FilePath.path + "/_02_byte_단위_입출력/ex13/file2.data");

		// 데이터 쓰기(DataOutputStream)
		try(OutputStream os = new FileOutputStream(dataFile);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);) {
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		}

		// 데이터 읽기(DataInputStream)
		try(InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}
	}
}
