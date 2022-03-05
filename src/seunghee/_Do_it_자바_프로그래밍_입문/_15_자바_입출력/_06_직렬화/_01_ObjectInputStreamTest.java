package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _01_ObjectInputStreamTest {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_06_직렬화/";

        try(FileInputStream fis = new FileInputStream(path + "_01_object.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            _01_Person p1 = (_01_Person) ois.readObject();
            _01_Person p2 = (_01_Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
