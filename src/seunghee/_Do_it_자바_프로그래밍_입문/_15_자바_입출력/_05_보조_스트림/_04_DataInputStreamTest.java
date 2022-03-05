package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._05_보조_스트림;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class _04_DataInputStreamTest {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_05_보조_스트림/";

        try(FileInputStream fis = new FileInputStream(path + "_04_data.txt");
            DataInputStream dis = new DataInputStream(fis)) {

            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
