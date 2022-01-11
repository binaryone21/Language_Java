package seunghee.study.Do_It_자바_프로그래밍_입문._15_자바_입출력._03_바이트_단위_스트림;

import java.io.FileInputStream;
import java.io.IOException;

public class _01_FileInputSTreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input01.txt");
            System.out.println(fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch(IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }

        System.out.println("end");
    }
}
