package seunghee._혼자_공부하는_자바._14_입출력_스트림._02_보조_스트림.ex02;

import seunghee._혼자_공부하는_자바._14_입출력_스트림._02_보조_스트림.FilePath;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {
		String originalFilePath1 = FilePath.path + "/ex02/originText1.txt";
		String targetFilePath1 = FilePath.path + "/ex02/targetText1.txt";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = FilePath.path + "/ex02/originText2.txt";
		String targetFilePath2 = FilePath.path + "/ex02/targetText2.txt";
		FileInputStream bufFis = new FileInputStream(originalFilePath2);
		FileOutputStream bufFos = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(bufFis);
		BufferedOutputStream bos = new BufferedOutputStream(bufFos);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때 : \t" + nonBufferTime + "ns");
		
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 : \t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
		
	}
}
