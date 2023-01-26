package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._02_표준_입출력.ex01;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파뱃 하나를 쓰고 [Enter]를 누르세요.");

        int i;
        try {
            i = System.in.read();
            System.out.println((char)i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
