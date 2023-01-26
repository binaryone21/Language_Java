package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._03_스트림.ex03;

import java.util.Arrays;

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings =  {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) ->  {
            if(s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        }));

        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
