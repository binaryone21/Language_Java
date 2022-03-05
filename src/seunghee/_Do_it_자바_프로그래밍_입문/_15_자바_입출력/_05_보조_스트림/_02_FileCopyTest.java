package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._05_보조_스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _02_FileCopyTest {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_05_보조_스트림/";

        long millisecond = 0;
        try(FileInputStream fis = new FileInputStream(path + "_01_reader.txt");
            FileOutputStream fos = new FileOutputStream(path + "_02_copy.txt")) {
            millisecond = System.currentTimeMillis();
            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일 복사하는데 " + millisecond + " milliseconds 소요되었습니다.");
    }
}
