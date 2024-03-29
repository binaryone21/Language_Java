package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._05_보조_스트림.ex04;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_05_보조_스트림/ex04/";

        try(FileOutputStream fos = new FileOutputStream(path + "data.txt");
            DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
