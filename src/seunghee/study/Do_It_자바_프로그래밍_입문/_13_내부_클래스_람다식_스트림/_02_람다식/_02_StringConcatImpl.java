package seunghee.study.Do_It_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식;

public class _02_StringConcatImpl implements _02_StringConcat {
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + ", " + s2);
    }
}
