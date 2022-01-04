package seunghee.study.Do_It_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식;

public class _03_TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        _03_StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
        concat.makeString(s1, s2);
    }
}
