package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식;

public class _02_TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        _02_StringConcatImpl concat = new _02_StringConcatImpl();
        concat.makeString(s1, s2);
    }
}
