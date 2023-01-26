package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._07_그_외_입출력_클래스.ex02;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_07_그_외_입출력_클래스/ex02/";

        RandomAccessFile rf = null;

        rf = new RandomAccessFile(path + "random.txt", "rw");
        rf.writeInt(100);
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
        rf.writeUTF("안녕하세요");
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());

        rf.seek(0);
        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
