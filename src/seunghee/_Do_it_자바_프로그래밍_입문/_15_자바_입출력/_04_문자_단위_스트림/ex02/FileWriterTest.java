package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._04_문자_단위_스트림.ex02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String path = "src/seunghee/_Do_It_자바_프로그래밍_입문/_15_자바_입출력/_04_문자_단위_스트림/ex02/";

        try(FileWriter fw = new FileWriter(path + "writer.txt")) {
            fw.write('A');
            char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};

            fw.write(buf);
            fw.write("안녕하세요. 잘 써지네요");
            fw.write(buf, 1, 2);
            fw.write("65");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
