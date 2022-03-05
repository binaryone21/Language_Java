package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _02_ExternalOutputTest {
    public static void main(String[] args) {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_06_직렬화/";

        _02_Dog myDog = new _02_Dog();
        myDog.name = "멍멍이";

        try(FileOutputStream fos = new FileOutputStream(path + "_02_External.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(myDog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
