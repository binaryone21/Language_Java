package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._04_문자_단위_스트림;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _01_FileReaderTest {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_05_보조_스트림/";

        try(FileReader fr = new FileReader(path + "_01_reader.txt")) {
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
