package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._02_예외_처리하기.ex03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("text.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행됩니다.");
        }
        System.out.println("여기도 수행됩니다.");
    }
}
