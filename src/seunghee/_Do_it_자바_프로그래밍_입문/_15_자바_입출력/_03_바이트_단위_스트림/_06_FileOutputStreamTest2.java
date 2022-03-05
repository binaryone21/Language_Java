package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._03_바이트_단위_스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_FileOutputStreamTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/seunghee/study/Do_It_자바_프로그래밍_입문/_15_자바_입출력/_03_바이트_단위_스트림/";
        FileOutputStream fos = new FileOutputStream(path + "_06_output.txt");
        try(fos) {
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i = 0; i<bs.length; i++) {
                bs[i] = data;
                data++;
            }
            fos.write(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
