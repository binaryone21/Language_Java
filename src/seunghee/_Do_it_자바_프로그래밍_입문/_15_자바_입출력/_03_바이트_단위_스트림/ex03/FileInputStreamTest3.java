package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._03_바이트_단위_스트림.ex03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_03_바이트_단위_스트림/ex03/";
        try(FileInputStream fis = new FileInputStream(path + "input.txt")) {
            byte[] bs = new byte[10];
            int i;
            while((i = fis.read(bs)) != -1) {
                for(byte b : bs) {
                    System.out.print((char)b);
                }
                System.out.println(" : " + i + "바이트 읽음");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
