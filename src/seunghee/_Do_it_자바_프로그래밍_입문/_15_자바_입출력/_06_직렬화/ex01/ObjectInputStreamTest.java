package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화.ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_06_직렬화/ex01/";

        try(FileInputStream fis = new FileInputStream(path + "object.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
