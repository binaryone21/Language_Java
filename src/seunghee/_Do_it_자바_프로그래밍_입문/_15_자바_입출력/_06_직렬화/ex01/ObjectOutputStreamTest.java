package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화.ex01;

import java.io.*;

public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_06_직렬화/ex01/";

        Person personAhn = new Person("안재용", "대표이사");
        Person personKim = new Person("김철수", "상무이사");

        try(FileOutputStream fos = new FileOutputStream(path + "object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personAhn);
            oos.writeObject(personKim);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
