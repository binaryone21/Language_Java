package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._03_스트림.ex03;

import java.util.function.BinaryOperator;

public class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}
