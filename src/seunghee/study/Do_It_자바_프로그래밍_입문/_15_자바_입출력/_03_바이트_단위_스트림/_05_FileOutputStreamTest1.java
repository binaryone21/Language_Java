package seunghee.study.Do_It_자바_프로그래밍_입문._15_자바_입출력._03_바이트_단위_스트림;

import java.io.FileOutputStream;
import java.io.IOException;

public class _05_FileOutputStreamTest1 {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_03_바이트_단위_스트림/";
        try(FileOutputStream fos = new FileOutputStream(path + "output05.txt")) {
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
