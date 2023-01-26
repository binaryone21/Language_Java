package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식.ex02;

public class StringConcatImpl implements StringConcat {
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + ", " + s2);
    }
}
