package seunghee._Do_it_자바_완전_정복._14_예외_처리._01_예외;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class _01_A implements Cloneable {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class _01_CheckedException {
    public static void main(String[] args) {
        // Checked Exception(일반 예외)

        // 1. InterruptedException
        // Thread.sleep(1000);

        // 2. ClassNotFoundException
        // Class cls = Class.forName("java.lang.Object");

        // 3. IOException
        InputStreamReader in = new InputStreamReader(System.in);
        // in.read();

        // 4. FileNotFoundException
        // FileInputStream fis = new FileInputStream("text.txt");

        // 5. ClassNotSupportedException
        _01_A a1 = new _01_A();
        // _01_A a2 = (_01_A)a1.clone();
    }
}
