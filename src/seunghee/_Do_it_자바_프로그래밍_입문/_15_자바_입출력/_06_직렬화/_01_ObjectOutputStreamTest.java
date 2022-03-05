package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화;

import java.io.*;

public class _01_ObjectOutputStreamTest {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_06_직렬화/";

        _01_Person personAhn = new _01_Person("안재용", "대표이사");
        _01_Person personKim = new _01_Person("김철수", "상무이사");

        try(FileOutputStream fos = new FileOutputStream(path + "_01_object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personAhn);
            oos.writeObject(personKim);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
