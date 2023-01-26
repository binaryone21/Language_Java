package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._03_예외_처리_미루기.ex01;

import java.io.FileInputStream;

public class ThrowsException {
    public Class loadCLass(String fileName, String className) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) throws Exception {
        ThrowsException test = new ThrowsException();
        test.loadCLass("_01_text.txt", "java.lang.String");
    }
}
