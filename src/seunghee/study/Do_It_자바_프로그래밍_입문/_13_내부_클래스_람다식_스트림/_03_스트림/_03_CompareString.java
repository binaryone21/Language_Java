package seunghee.study.Do_It_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._03_스트림;

import java.nio.charset.StandardCharsets;
import java.util.function.BinaryOperator;

public class _03_CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}
