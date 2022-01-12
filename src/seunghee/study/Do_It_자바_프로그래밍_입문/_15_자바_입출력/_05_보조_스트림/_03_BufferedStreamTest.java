package seunghee.study.Do_It_자바_프로그래밍_입문._15_자바_입출력._05_보조_스트림;

import java.io.*;

public class _03_BufferedStreamTest {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_05_보조_스트림/";

        long millisecond = 0;
        try(FileInputStream fis = new FileInputStream(path + "_01_reader.txt");
            FileOutputStream fos = new FileOutputStream(path + "_03_copy.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            millisecond = System.currentTimeMillis();
            int i;
            while((i = bis.read()) != -1) {
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일 복사하는 데 " + millisecond + " milliseconds 소요되었습니다.");
    }
}
