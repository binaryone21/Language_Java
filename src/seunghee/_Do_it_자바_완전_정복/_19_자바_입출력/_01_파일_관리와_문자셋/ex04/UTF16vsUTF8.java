package seunghee._Do_it_자바_완전_정복._19_자바_입출력._01_파일_관리와_문자셋.ex04;

import java.io.UnsupportedEncodingException;

public class UTF16vsUTF8 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // UTF-16 vs UTF-8
        byte[] b1 = "abc".getBytes("UTF-16");
        byte[] b2 = "abc".getBytes("UTF-8");
        System.out.println(b1.length);
        System.out.println(b2.length);
        for(byte b : b1)
            System.out.printf("%02X ", b);
        System.out.println();
        for(byte b : b2)
            System.out.printf("%02X ", b);
        System.out.println();
        System.out.println(new String(b1, "UTF-16"));
        System.out.println(new String(b2, "UTF-8"));
        System.out.println();

        byte[] b3 = "가나다".getBytes("UTF-16");
        byte[] b4 = "가나다".getBytes("UTF-8");
        System.out.println(b3.length);
        System.out.println(b4.length);
        for(byte b : b3)
            System.out.printf("%02X ", b);
        System.out.println();
        for(byte b : b4)
            System.out.printf("%02X ", b);
        System.out.println();
        System.out.println(new String(b3, "UTF-16"));
        System.out.println(new String(b4, "UTF-8"));
        System.out.println();
    }
}