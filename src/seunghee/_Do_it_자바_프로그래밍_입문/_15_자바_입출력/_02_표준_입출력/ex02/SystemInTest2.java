package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._02_표준_입출력.ex02;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {
        System.out.println("알파뱃 여러 개를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            while ((i = System.in.read()) != -1) {
                System.out.print((char) i);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
