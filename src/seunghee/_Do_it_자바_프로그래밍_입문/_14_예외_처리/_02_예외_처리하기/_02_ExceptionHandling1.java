package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._02_예외_처리하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _02_ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("_02_text.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("여기도 수행됩니다.");
    }
}
