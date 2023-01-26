package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식.ex03;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
        concat.makeString(s1, s2);
    }
}
