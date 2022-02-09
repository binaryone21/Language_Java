package seunghee._혼자_공부하는_자바._14_입출력_스트림._02_보조_스트림;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _03_DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream(_00_FilePath.path + "/03_text.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream(_00_FilePath.path + "/03_text.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
	}
}
