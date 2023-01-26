package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._03_바이트_단위_스트림.ex05;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_03_바이트_단위_스트림/ex05/";
        try(FileOutputStream fos = new FileOutputStream(path + "output.txt")) {
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
