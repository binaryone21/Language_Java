package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화;

import java.io.*;

public class _02_ExternalInputTest {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_06_직렬화/";

        try(FileInputStream fis = new FileInputStream(path + "_02_External.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);) {

            _02_Dog dog = (_02_Dog) ois.readObject();
            System.out.println(dog);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
