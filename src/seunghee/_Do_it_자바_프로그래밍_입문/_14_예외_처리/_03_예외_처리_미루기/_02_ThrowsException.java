package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._03_예외_처리_미루기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _02_ThrowsException {
    public Class loadCLass(String fileName, String className) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        _01_ThrowsException test = new _01_ThrowsException();
        try {
            test.loadCLass("_01_text.txt", "java.lang.String");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
