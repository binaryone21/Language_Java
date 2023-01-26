package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스.ex04;

public class AnonymousInnerTest {
    public static void main(String[] args) {
        OutClass out = new OutClass();
        Runnable runnable = out.getRunnable(10);
        runnable.run();
        out.runner.run();
    }
}
