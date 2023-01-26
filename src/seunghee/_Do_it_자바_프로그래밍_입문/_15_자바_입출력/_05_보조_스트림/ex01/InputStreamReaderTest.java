package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._05_보조_스트림.ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_05_보조_스트림/ex01/";

        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(path + "reader.txt"))) {
            int i;
            while((i = isr.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
