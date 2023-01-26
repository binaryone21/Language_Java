package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._03_바이트_단위_스트림.ex02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_03_바이트_단위_스트림/ex02/";
        try(FileInputStream fis = new FileInputStream( path + "input.txt")) {
            int i;
            while((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
