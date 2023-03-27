package seunghee._Do_it_자바_완전_정복._19_자바_입출력._02_byte_단위_입출력.ex11;

import seunghee._Do_it_자바_완전_정복._19_자바_입출력.FilePath;

import java.io.*;

public class BufferedInputOutputStream {
	public static void main(String[] args) {
		// 파일 생성
		File orgFile = new File(FilePath.path + "/_02_byte_단위_입출력/ex11/myCat_origin.jpg");
		File copyFile1 = new File(FilePath.path + "/_02_byte_단위_입출력/ex11/myCat_copy1.jpg");
		File copyFile2 = new File(FilePath.path + "/_02_byte_단위_입출력/ex11/myCat_copy2.jpg");
		long start, end, time1, time2;

		// 1. BufferedInputStream, BufferedOutputStream을 사용하지 않을 때
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(orgFile);
			OutputStream os = new FileOutputStream(copyFile1);) {
			// 복사하는 코드
			int data;
			while((data = is.read()) != -1) {
				os.write(data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1);

		// 2. BufferedInputStream, BufferedOutputStream을 사용했을 때
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(orgFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyFile2);
			BufferedOutputStream bos = new BufferedOutputStream(os);) {
			// 복사 하는 코드
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);

		// 사용 했을 때와 사용하지 않았을 때 비교
		System.out.println("Ratio of with and without : " + time1/time2);
	}
}
