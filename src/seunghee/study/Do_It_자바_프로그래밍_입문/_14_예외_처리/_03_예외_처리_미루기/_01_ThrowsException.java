package seunghee.study.Do_It_자바_프로그래밍_입문._14_예외_처리._03_예외_처리_미루기;

import java.io.FileInputStream;

public class _01_ThrowsException {
    public Class loadCLass(String fileName, String className) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) throws Exception {
        _01_ThrowsException test = new _01_ThrowsException();
        test.loadCLass("_01_text.txt", "java.lang.String");
    }
}
