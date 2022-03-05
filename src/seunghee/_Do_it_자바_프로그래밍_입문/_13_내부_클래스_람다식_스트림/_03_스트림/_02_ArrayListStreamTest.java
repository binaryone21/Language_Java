package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._03_스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _02_ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
