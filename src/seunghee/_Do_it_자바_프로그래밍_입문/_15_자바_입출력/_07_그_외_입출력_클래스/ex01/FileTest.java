package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._07_그_외_입출력_클래스.ex01;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_07_그_외_입출력_클래스/ex01/";

        File file = new File( path + "file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
}
