package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._03_스트림;


import java.util.Arrays;

public class _01_IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sumVal = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count();

        System.out.println(sumVal);
        System.out.println(count);
    }
}
