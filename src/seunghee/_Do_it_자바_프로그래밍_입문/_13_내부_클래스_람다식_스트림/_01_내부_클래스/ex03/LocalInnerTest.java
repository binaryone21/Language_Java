package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스.ex03;

public class LocalInnerTest {
    public static void main(String[] args) {
        OutClass out = new OutClass();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}
