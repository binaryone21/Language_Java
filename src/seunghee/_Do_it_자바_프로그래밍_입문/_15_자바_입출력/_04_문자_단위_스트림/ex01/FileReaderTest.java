package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._04_문자_단위_스트림.ex01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_04_문자_단위_스트림/ex01/";

        try(FileReader fr = new FileReader(path + "reader.txt")) {
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
