package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화.ex02;

import java.io.*;

public class ExternalInputTest {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_06_직렬화/ex02/";

        try(FileInputStream fis = new FileInputStream(path + "External.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);) {

            Dog dog = (Dog) ois.readObject();
            System.out.println(dog);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
